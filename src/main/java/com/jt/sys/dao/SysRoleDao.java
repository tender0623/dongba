package com.jt.sys.dao;

/**
 * Created by CGB on 2019/3/7.
 */

import com.jt.sys.pojo.SysRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**数据持久层
 * 此类型对象由谁创建(框架,mybatis)
 * 回顾mybatis中是如何获取DAO对象的?
 * SysRoleDao dao=sqlSession.getMapper(SysRoleDao.class)
 *
 * 说明:在mybatis应用于此接口对应的通常会有一个mapper文件
 * */
public interface SysRoleDao {
    /**查询所有角色信息*/
    List<SysRole> findPageObjects(@Param("name") String name);

    /**
     *
     * @param name 按名字查询参数
     * @param pageSize 每页最多显示多少提交记录
     * @return
     */
    List<SysRole> findPageObjects(@Param("name") String name, @Param("startIndex") Integer startIndex,@Param("pageSize") Integer pageSize);
    /**统计记录数*/
    int getRowCount(@Param("name") String name);
    /**向表中写入数据*/
    int insertObject(SysRole entity);
    /**根据id查询角色信息*/
    SysRole findObjectById(Integer id);
    /**修改角色信息*/
    int updateObject(SysRole entity);
    /**根据id删除角色信息,这个ids可能对应多个id值,如1,2,3*/
    int deleteObject(@Param("ids") String[] ids);
}
