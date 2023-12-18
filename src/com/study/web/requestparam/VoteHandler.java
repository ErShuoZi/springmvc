package com.study.web.requestparam;


import com.study.web.requestparam.entity.Master;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping(value = "/vote")
@Controller
public class VoteHandler {

    //required = false
    @RequestMapping(value = "/vote01")
    public String test01(@RequestParam(value = "name",required = false) String username){
        System.out.println("得到的username =" + username);
        return "sucess";
    }


//    @RequestMapping(value = "/vote02")
//    public String test02(){
//
//        return "sucess";
//    }

    @RequestMapping(value = "/vote02")
    public String test02(@RequestHeader("Accept-Encoding") String ae,@RequestHeader("Host") String host){
        System.out.println("请求消息头：" + ae);
        System.out.println("请求host：" + host);
        return "sucess";
    }


    @RequestMapping(value = "/vote03")
    /**
     * 提交数据->封装成java对象
     * 如果属性是对象，通过字段名.字段名 比如Master [pet]
     * 即提交的数据参数名是pet.id pet.name 级联操作
     */
    public String test03(Master master){
        System.out.println("master=" + master);

        return "sucess";
    }


    //使用servlet获取提交的参数
    @RequestMapping(value = "/vote04")
    public String test04(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        System.out.println(username);
        return "sucess";
    }
}
