package com.jt.sys.controller;

import com.jt.common.vo.JsonResult;
import com.jt.common.vo.PageObject;
import com.jt.sys.pojo.SysRole;
import com.jt.sys.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by CGB on 2019/3/6.
 */
@RequestMapping("/role/")
@Controller
public class RoleController {
    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping("doRoleListUI")
    public String listUI() {
        //return "sys/rolespost";
        return "sys/role_list";
    }

    @RequestMapping("doDeleteObject.do")
    @ResponseBody
    public JsonResult doDeleteObject(String checkedIds) {
        sysRoleService.deleteObject(checkedIds);
        return new JsonResult(1,"delete ok");
    }

    @RequestMapping("doFindPageObjects")
    @ResponseBody
    public JsonResult doFindPageObjects(Integer pageCurrent, String name) {
//        List<SysRole> list = sysRoleService.findPageObjects(name);
//        System.out.println(list);
        PageObject<SysRole> object = sysRoleService.findPageObjects(name, pageCurrent);
        return new JsonResult(1,"query ok",object);
    }


    @RequestMapping("doSaveObject")
    @ResponseBody
    public JsonResult doSaveObject(SysRole entity){
        sysRoleService.saveObject(entity);
        return  new JsonResult(1,"save ok");
    }



    @RequestMapping("editUI")
    public String editUI(){
        return "sys/role_edit";
    }
    @ResponseBody
    @RequestMapping("doFindObjectById")
    public SysRole doFindObjectById(Integer id){
        return sysRoleService.findObjectById(id);
    }


    @RequestMapping("doUpdateObject")
    @ResponseBody
    public JsonResult doupdateObject(SysRole entity){
        sysRoleService.updateObject(entity);
        return new JsonResult(1,"update ok");
    }
}
