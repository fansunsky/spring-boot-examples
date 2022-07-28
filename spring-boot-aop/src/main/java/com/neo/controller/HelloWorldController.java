package com.neo.controller;

import com.neo.aop.MyAroundAop;
import com.neo.aop.MyLogAnnotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
    @RequestMapping("/helloAop")
    public Object hello(){
        return "hello aop";
    }
    @RequestMapping("/helloError")
    public Object helloError(){
        return 1/0;
    }

    @RequestMapping("helloAnnotation")
    //标有这个注解的方法会被增强
    @MyLogAnnotation(desc = "@Annotation")
    public Object helloAnnotation() {
        return "hello annotation";
    }

    @RequestMapping("/helloAround")
    public Object helloAround(){
        System.out.println("helloAround执行了。。。");
        return "hello around";
    }

}