package com.study.web.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/goods")
@Controller
public class GoodsHandler {
    @RequestMapping("/buy")
    public String buy() {
        System.out.println("-------buy()-------------");
        //返回自定义视图 return "";
        return "lsView";
    }

    //直接指定要请求转发的或者是重定向的页面
    @RequestMapping(value = "/order")
    public String order() {
        System.out.println("==========order======");

        //请求转发到WEB-INFO/pages/my_view.jsp
        ///WEB-INF/pages/my_view.jsp 这个路径会被解析为/springmvc/WEB-INF/pages/xxx
//        return "forward:/aa/bb/ok.jsp";
        //直接指定要重定向的页面
        //对于重定向来说，不能重定向到WEB-INFO目录下
        return "redirect:/login.jsp";

    }
}
