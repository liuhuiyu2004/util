package com.liuhuiyu.util.web;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author LiuHuiYu
 * @version v1.0.0.0
 * Created DateTime 2020-06-23 13:23
 */
public class HttpUtil {
    public static @NotNull HttpServletRequest getHttpServletRequest() throws Exception {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (null == attributes) {
            throw new Exception("Spring配置错误");
        } else {
            return attributes.getRequest();
        }
    }

    public static HttpServletResponse getHttpServletResponse() throws Exception {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (null == attributes) {
            throw new Exception("Spring配置错误");
        } else {
            return attributes.getResponse();
        }
    }
}

