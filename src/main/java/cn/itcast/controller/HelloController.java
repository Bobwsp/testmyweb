package cn.itcast.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class HelloController {

    @RequestMapping("hello")
    public String sayHell(){
        System.out.println("hello springMVC!");
        return "success";
    }
}
