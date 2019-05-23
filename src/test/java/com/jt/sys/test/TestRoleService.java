package com.jt.sys.test;

import com.jt.common.vo.PageObject;
import com.jt.sys.dao.SysUserDao;
import com.jt.sys.pojo.SysRole;
import com.jt.sys.pojo.SysUser;
import com.jt.sys.service.SysRoleService;
import com.jt.sys.service.SysUserService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by CGB on 2019/3/6.
 */
public class TestRoleService {
    private ClassPathXmlApplicationContext ctx;
    @Before
    public void init(){
       ctx= new ClassPathXmlApplicationContext("spring-configs.xml");

    }
    @Test
   public void testFindPageObjects(String name){
        SysUserDao dao = ctx.getBean("sysUerDao", SysUserDao.class);
        int startIndex=0;
        int pageSize=3;
        List<SysUser> list = dao.findObjects("d",startIndex,pageSize);
        System.out.println(list);


    }
    @After
    public void destroy(){
        ctx.close();
    }
}
