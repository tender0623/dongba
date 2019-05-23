package com.jt.sys.test;

import com.jt.sys.pojo.SysRole;
import com.jt.sys.service.SysRoleService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by CGB on 2019/3/11.
 */
public class TestSysRoleService {
    private ClassPathXmlApplicationContext ctx;
    @Before
    public void init(){
        ctx= new ClassPathXmlApplicationContext("spring-configs.xml");
    }
    @Test
    public void testSaveObject(){
        SysRoleService service = ctx.getBean("sysRoleServiceImpl", SysRoleService.class);
        SysRole role = new SysRole();
        role.setName("KK");
        role.setNote("KKKKKK");
        role.setCreatedUser("admin");
        role.setModifiedUser("admin");
        int rows = service.saveObject(role);
        Assert.assertEquals(1,rows);
    }
    @After
    public void destroy(){
        ctx.close();
    }
}
