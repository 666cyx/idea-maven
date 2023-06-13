package cn.lzy;

import cn.lzy.configbean.Student;
import cn.lzy.controller.ChapterController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterTestApplication {
//    private  String TAG="ChapterTestApplication";
    @Autowired
    ChapterController chapterController;
    @Autowired
   Student student;


    
    @Test
    public void contextLoads(){
        System.out.println("单元测试返回的数据--"+chapterController.sayHello());
        System.out.println("单元测试返回的student数据--"+student);
    }
//    public void  getHello(){
//        String result=chapterController.sayHello();
//        System.out.println(TAG+"单元测试返回==="+result);
//    }
}