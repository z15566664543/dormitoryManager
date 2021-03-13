package com.itheima.service;
import java.util.List;

import com.itheima.po.Admin;

/**
 * 用户Service层接口
 */
public interface AdminService {
	// 通过账号和密码查询用户
	public Admin findAdmin(Admin admin);

	//找到所有所有数据
	public List<Admin> getAll();

	public int addAdmin(Admin admin);    //添加管理员信息
	public int deleteAdmin(Integer a_id);   //删除管理员信息
	public int updateAdmin(Admin admin); //修改管理员信息
	public Admin findAdminById(Integer a_id);
}
