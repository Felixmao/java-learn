package ssm.module01.test;

import org.junit.Test;
import ssm.module01.controller.CtrlTransactional;
import ssm.module01.service.ServiceTransactional;
import ssm.utils.BaseTest;

import javax.annotation.Resource;

public class TestTransactional extends BaseTest {
    @Resource
    private CtrlTransactional controller;
    @Resource
    private ServiceTransactional service;

    //事物管理：异常被捕获
    @Test
    public void t1() throws Exception{
        //controller.t1();
    }

    //事物管理：事物嵌套
    @Test
    public void td01() throws Exception{
        service.doubleMethod01();
    }

    //事物管理：事物嵌套
    @Test
    public void td02() throws Exception{
        service.doubleMethod02();
    }

    //事物管理：IO
    @Test
    public void io() throws Exception{
        service.io();
    }
}
