package com.study.web.requestparam;


import com.study.web.requestparam.entity.Master;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Objects;

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


    //将提交的数据->封装成java对象->springmvc会自动把数据放到request域
    @RequestMapping(value = "/vote05")
    public String test05(Master master,HttpServletRequest request){
        //1.springmvc会自动把获取的model模型，放入到request域中，名字就是master
        //2.也可手动将master放入到request

        request.setAttribute("address","beijing");

        //修改request域中
        master.setName("nono");

        //SpringMVC默认存放对象属性到request域中，属性名是类型名首字母小写

        return "vote_ok";
    }

    //通过Map<String,Object>设置数据到request域

    @RequestMapping(value = "/vote06")
    public String test06(Master master, Map<String, Object> map){
        //通过map对象添加属性到request域中
        //原理：springmvc会遍历map，然后将map的k-v存放到request域中
        map.put("address","tianjin");
        //修改request域中
        master.setName("nono");

        //SpringMVC默认存放对象属性到request域中，属性名是类型名首字母小写

        return "vote_ok";
    }
}
