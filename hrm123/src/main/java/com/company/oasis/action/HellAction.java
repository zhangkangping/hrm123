package com.company.oasis.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellAction {
@RequestMapping("hello.do")
@ResponseBody

    public String hello(){
        return "hello world!";
    }
}
