package com.itheima.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.AdminDao;
import com.itheima.po.Admin;
import com.itheima.service.AdminService;

/**
 * 用户Service接口实现类
 */
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {
	// 注入UserDao
	@Autowired
	private AdminDao adminDao;

	//管理登陆查询
	@Override
	public Admin findAdmin(Admin admin) {
		Admin a = adminDao.findAdmin(admin);
		return a;
	}

	@Override
	public List<Admin> getAll(){

		List<Admin> adminList = adminDao.getAll();
		return adminList;
    }


	//添加管理员信息
	@Override
	public int addAdmin(Admin admin) {
		return adminDao.addAdmin(admin);
	}

	//通过id删除管理员信息
	@Override
	public int deleteAdmin(Integer a_id) {
		return adminDao.deleteAdmin(a_id);
	}

	//修改管理员信息
	@Override
	public int updateAdmin(Admin admin) {
		return adminDao.updateAdmin(admin);
	}

	@Override
	public Admin findAdminById (Integer a_id){
		Admin a = adminDao.findAdminById(a_id);
		return  a;
	}
}
