package com.study.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//此時請求的url是http://localhost:8080/工程路徑/user/buy
@RequestMapping(value = "/user")
@Controller  //處理器/控制器，注入到容器中
public class UserHandler {
//    @RequestMapping(value = "/buy",method = RequestMethod.POST)
// public String buy(){
//     System.out.println("購買商品");
//     return "sucess";
// }

    @PostMapping(value = "/buy")  //等价于   @RequestMapping(value = "/buy",method = RequestMethod.POST)
    public String buy(){
        System.out.println("購買商品");
        return "sucess";
    }

    @RequestMapping(value = "/search",params = "bookId",method = RequestMethod.GET)
 public String search(String bookId) {
     System.out.println("查詢書籍bookId=" + bookId);
     return "sucess";
 }


 //要求 可以配置/user/message/aa ，/user/message/aa/bb/cc

    /**
     * Ant風格Url
     * /user/"*"/create：匹配/user/aa/create，/user/bb/create...
     * /user/"**"/create：匹配/user/aa/VV/create，/user/bb/CC/create...
     * /user/create??：匹配/user/createaa，/user/createvv...
     * @return
     */
    @RequestMapping(value = "/message/**")
    public String im() {
        System.out.println("發送消息");
        return "sucess";
    }


    //@PathVariable映射URL綁定的佔位符
    //前端的傳遞方式<a href="/reg/a/b/c" 其中 b和c就是參數了
    @RequestMapping(value = "/reg/{username}/{userid}")
    public String register(@PathVariable("username") String name, @PathVariable("userid") String id){
        System.out.println("接受到的參數--" + "username=" + name + "--" + "userid" + id);
        return "sucess";
    }


}
