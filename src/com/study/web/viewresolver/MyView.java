package com.study.web.viewresolver;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 自定义视图
 * 1.extends AbstractView就可以作为一个视图使用
 * 2.@Component(value = "myView"):会注入到容器中  该组件在容器中的id为myView
 */
@Component(value = "lsView")
public class MyView extends AbstractView {
    @Override
    protected void renderMergedOutputModel(Map<String, Object> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //完成视图渲染
        //并且可以确定要跳转的页面
        System.out.println("进入到自己自定义的视图");
        ///WEB-INF/pages/my_view.jsp会被spring解析成/spring/WEB-INF/pages/my_view.jsp
        httpServletRequest.getRequestDispatcher("/WEB-INF/pages/my_view.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
