package com.jt.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by CGB on 2019/3/10.
 */
@RequestMapping("/")
@Controller
public class IndexController {
    @RequestMapping("indexUI")
    public String indexUI(){
        return "starter";
    }
    @RequestMapping("doPageUI")
    public String doPageUI(){
        return "common/page";
    }
}
