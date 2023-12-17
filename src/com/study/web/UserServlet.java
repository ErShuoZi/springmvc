package com.study.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 1。如果使用了SpringMVC。在在一個類上標識了@Controller註解
 * 2. 標識將該類視爲一個控制器，注入到容器中
 * 3. 比原生到servlet開發簡化很多
 * 4.return "login_ok";:表示返回結果給視圖解析器
 * 5.視圖解析器會根據配置，決定跳轉到哪個頁面
 */
@Controller
public class UserServlet {
    //編寫方法，響應用戶請求
    @RequestMapping(value = "/login")
    public String login() {
        System.out.println("login ok~");
        return "login_ok";
    }
}
