package com.jt.sys.service;

import com.jt.common.vo.PageObject;
import com.jt.sys.pojo.SysRole;

/**
 * Created by CGB on 2019/3/7.
 */
public interface SysRoleService {

    //List<SysRole> findPageObjects(String name);

    /**
     *
     * @param pageCurrent 当前页码
     * @param name 按名字搜索是输入的参数
     * @return
     */
    PageObject<SysRole> findPageObjects(
            String username,
            Integer pageCurrent);
    /**根据id执行删除操作*/
    int deleteObject(String ids);
    /**保存角色信息*/
    int saveObject(SysRole entity);
    /**根据id查询角色信息*/
    SysRole findObjectById(Integer id);
    /**修改角色信息*/
    int updateObject(SysRole entity);
}
