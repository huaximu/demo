package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author Administrator
 */
@RequestMapping("/test")
@Controller
public class UserController {
    @GetMapping("/test1")
    //@ResponseBody
    public String test(Model model){
        //Map<String, Object> ret = new HashMap<String, Object>();
        User user=new User();
        user.setName("hh");
        user.setAge(33);
       // ret.put("user",user);
        model.addAttribute("user",user);
        return "test";
    }
    @GetMapping("/test2")
    public String test2(){

        return "success";
    }
}
