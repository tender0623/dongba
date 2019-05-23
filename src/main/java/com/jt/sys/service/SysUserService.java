package com.jt.sys.service;

import com.jt.common.vo.PageObject;
import com.jt.sys.pojo.SysUser;

import java.util.List;

/**
 * Created by CGB on 2019/3/14.
 */
public interface SysUserService {
    PageObject findObjects(String username,Integer currentPage);
    int validById(Integer id,Integer valid,String modifiedUser);
}
