package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @author Administrator
 */
@Controller
public class UserController {
    @GetMapping("/test")
   // @ResponseBody
    public Map<String,Object> test(){
        Map<String, Object> ret = new HashMap<String, Object>();
        User user=new User();
        user.setName("hh");
        user.setAge(33);
        ret.put("user",user);


        return ret;


    }
}
