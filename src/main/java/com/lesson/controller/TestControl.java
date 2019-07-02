package com.lesson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 〈restTemplate测试接收〉
 *
 * @author gaolinfang
 * @create 2019/7/2
 * @since 1.0.0
 */

@Controller
@RequestMapping("/test")
public class TestControl {
    @RequestMapping(value = "/test1")
    public String test(HttpServletRequest request){
        byte[] body = new byte[1024];

        try {
            request.getInputStream().read(body);
            System.out.println(new String(body));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(request.getParameterMap());
        System.out.println(request);
        return "jsp/empty.jsp";
    }
}
 
