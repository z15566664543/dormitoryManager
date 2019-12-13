package com.itheima.service;

import java.util.List;

import com.itheima.po.PageInfo;
import com.itheima.po.Visitor;

/**
 * @program: dormitorySystem
 * @description: 访客
 * @author: zhouzhen
 **/
public interface VisitorService {
    //分页查询
	public PageInfo<Visitor> findPageInfo(String v_name, String v_phone, Integer pageIndex, Integer pageSize);
    public int addVisitor(Visitor visitor);   //添加访客信息
    public List<Visitor> getAll();
}
