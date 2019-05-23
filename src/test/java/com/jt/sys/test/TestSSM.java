package com.jt.sys.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by CGB on 2019/3/6.
 */
public class TestSSM {
    private ClassPathXmlApplicationContext ctx;
    @Before
    public void init(){
       ctx= new ClassPathXmlApplicationContext("spring-configs.xml");

    }
    @Test
    public void testDRUID(){
        Object obj = ctx.getBean("dataSource");
        Assert.assertNotEquals(null,obj);
        System.out.println(obj);
    }
    @Test
    public void testSqlSessionFactory(){
        Object o = ctx.getBean("sqlSessionFactory");
        System.out.println(o);
    }
    @After
    public void destroy(){
        ctx.close();
    }
}
