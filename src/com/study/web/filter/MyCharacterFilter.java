package com.study.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器，处理中文乱码
 */

public class MyCharacterFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //处理中文
        servletRequest.setCharacterEncoding("utf-8");
        //放行请求
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }
}
