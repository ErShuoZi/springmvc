package com.study.web.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//处理rest风格请求 curd
@RequestMapping(value = "/book")
@Controller
public class BookHandler {
    @RequestMapping(value = "/getbook/{id}")
    public String getBook(@PathVariable("id") String  id){
        System.out.println("查询书籍id=" +  id);
        return "sucess";
    }


    @PostMapping(value = "/addbook")
    public String addBook(String name){
        System.out.println("添加书籍=" +  name);
        return "sucess";
    }

    @RequestMapping (value = "/delBook/{id}",method = RequestMethod.DELETE)
    public String delBook(@PathVariable("id") String id){
        System.out.println("删除书籍=" +  id);
//        return "sucess";  这样会报错
        return "redirect:/book/sucess";
    }
    @RequestMapping (value = "/sucess")
    public String successGenecal(){
        return "sucess"; //由该方法转发到sucess.jsp页面
    }


    @RequestMapping (value = "/updateBook/{id}",method = RequestMethod.PUT)
    public String updateBook(@PathVariable("id") String id){
        System.out.println("修改书籍=" +  id);
//        return "sucess";  这样会报错
        return "redirect:/book/sucess";
    }
}
