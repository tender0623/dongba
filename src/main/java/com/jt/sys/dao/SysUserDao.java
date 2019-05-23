package com.jt.sys.dao;

import com.jt.sys.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by CGB on 2019/3/14.
 */

/**
 * 此接口实现类交给spring创建
 */
public interface SysUserDao {
    List<SysUser>findObjects(@Param("username")String username,
    @Param("startIndex") Integer startIndex,
                             @Param("pageSize") Integer pageSize);
    int getRowCount(@Param("username")String username);
    int validById(@Param("id")Integer id,@Param("valid")Integer valid,@Param("modifiedUser") String modifiedUser);
}
