package cn.lzy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterController {
    private  String TAG="ChapterController";
    @RequestMapping(value = "/hello")
    public  String sayHello(){
        System.out.println(TAG+"123");
        return "hello Springboot  你好!";
    }
}

