package com.designpatterns.behavioral.chain_responsibility;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("执行 doFilter() 方法之前...");

        chain.doFilter(request, response);

        System.out.println("执行 doFilter() 方法之后...");
    }

    @Override
    public void destroy() {

    }
}
