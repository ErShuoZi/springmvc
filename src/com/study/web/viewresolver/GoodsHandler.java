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
}
