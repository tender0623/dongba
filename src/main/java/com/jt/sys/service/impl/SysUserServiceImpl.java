package com.jt.sys.service.impl;

import com.jt.common.ServiceException;
import com.jt.common.vo.PageObject;
import com.jt.sys.dao.SysUserDao;
import com.jt.sys.pojo.SysUser;
import com.jt.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CGB on 2019/3/14.
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    /**
     * @Autowired 默认按类型注入,如果spring容器中有多个此类型,注入可能会失败
     * 所以加 @Qualifier("sysUserDao") 按名字查找注入
     */
    //@Qualifier("sysUserDao")
    @Autowired
    SysUserDao sysUserDao;
    @Override
    public PageObject findObjects(String username, Integer pageCurrent) {
        //查询当前页数据
        int pageSize=3;
        int startIndex=(pageCurrent-1)*pageSize;
        List<SysUser> list = sysUserDao.findObjects(username, startIndex, pageSize);
        System.out.println(list);
        //根据条件查询总记录数
        int rowCount = sysUserDao.getRowCount(username);
        int pageCount=(rowCount-1)/pageSize+1;
        //3.封装当前数据
        PageObject p = new PageObject();
        p.setPageCount(pageCount);
        p.setPageCurrent(pageCurrent);
        p.setRowCount(rowCount);
        p.setRecords(list);
        return p;


    }

    @Override
    public int validById(Integer id, Integer valid,String modifiedUser) {
        //1.参数验证
        if(id==null)
            throw new ServiceException("id 不能为空");
        if(valid==null)
            throw new ServiceException("状态 值不能为空");
        //2.修改状态信息
        int i = sysUserDao.validById(id, valid,modifiedUser);
        return i;

    }
}
