package com.jt.sys.service.impl;

import com.jt.common.ServiceException;
import com.jt.common.vo.PageObject;
import com.jt.sys.dao.SysRoleDao;
import com.jt.sys.pojo.SysRole;
import com.jt.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CGB on 2019/3/7.
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleDao sysRoleDao;


    @Override
    public PageObject<SysRole> findPageObjects(String username, Integer pageCurrent) {
        if(pageCurrent<1)
            throw new ServiceException("当前页码不能为负数");
        //1.获取当前 页信息
        int pageSize=3;
        int startIndex=(pageCurrent-1)*pageSize;
        List<SysRole> list = sysRoleDao.findPageObjects(username, startIndex, pageSize);
        //2.获取总记录数,计算总页数
        int count = sysRoleDao.getRowCount(username);
        int pageCount=count/pageSize;
        if (count%pageSize!=0){
            pageCount++;
        }
        //3.封装数据到pageObject
        PageObject<SysRole> object = new PageObject<>();
        object.setRecords(list);
        object.setPageCount(pageCount);
        object.setRowCount(count);
        object.setPageCurrent(pageCurrent);
        return object;
    }

    @Override
    public int deleteObject(String ids) {
        //1.验证参数有效性
        if (ids == null || ids.length() == 0)
            throw new RuntimeException("删除的记录不能为空");
        //2.将参数数据进行装换成数组
        String[] checkedIds = ids.split(",");
        //执行删除操作
        return sysRoleDao.deleteObject(checkedIds);
    }

    @Override
    public int saveObject(SysRole entity) {
        if("admin".equals(entity.getName()))
            throw new ServiceException("此角色已经存在");
        int rows = sysRoleDao.insertObject(entity);
        return rows;
    }

    @Override
    public SysRole findObjectById(Integer id) {
        if (id == null)
            throw new ServiceException("id不能为空");
        SysRole role = sysRoleDao.findObjectById(id);
        return role;
    }

    @Override
    public int updateObject(SysRole entity) {
        if (entity == null)
            throw new RuntimeException("跟新对象不能为空");
        if (entity.getId() == null)
            throw new RuntimeException("更新对象id不能为空");
        return sysRoleDao.updateObject(entity);
    }

}
