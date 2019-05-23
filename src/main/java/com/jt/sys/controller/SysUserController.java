package com.jt.sys.controller;

import com.jt.common.vo.JsonResult;
import com.jt.common.vo.PageObject;
import com.jt.sys.dao.SysUserDao;
import com.jt.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by CGB on 2019/3/14.
 */
@Controller
@RequestMapping("/user/")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;
    @RequestMapping("listUI")
    public String listUI(){
        return "sys/user_list";
    }
    @RequestMapping("editUI")
    public String editUI(){
        return "sys/user_edit";
    }
    @RequestMapping("doFindPageObjects")
    @ResponseBody
    public JsonResult findObjects(String username,Integer pageCurrent){
        PageObject object = sysUserService.findObjects(username, pageCurrent);
        return new JsonResult(1,"ok",object);
    }
    @RequestMapping("doValidById")
    @ResponseBody
    public JsonResult doValidById(Integer id,Integer valid){
        sysUserService.validById(id,valid,"admin");
        return new JsonResult(1,"valid ok");
    }
}
