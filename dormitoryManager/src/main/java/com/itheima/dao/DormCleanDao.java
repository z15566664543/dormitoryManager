package com.itheima.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.itheima.po.DormClean;

/**
 * @program: dormitorySystem
 * @description: 宿舍卫生
 * @author: zhouzhen
 **/
public interface DormCleanDao {
    /**
     * 进行分页查询
     */
    //获取总条数
    public Integer totalCount(@Param("d_id") Integer d_id, @Param("d_dormbuilding") String d_dormbuilding);
    //获取用户列表
    public List<DormClean> getDormCleanList(@Param("d_id") Integer d_id, @Param("d_dormbuilding") String d_dormbuilding, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    public int addDormClean(DormClean dormclean);    //添加宿舍卫生信息
    public int deleteDormClean(Integer g_id);   //删除宿舍卫生信息
    public int updateDormClean(DormClean dormclean); //修改宿舍卫生信息
    public DormClean findDormCleanById(Integer g_id);
    public List<DormClean> getAll();

}
