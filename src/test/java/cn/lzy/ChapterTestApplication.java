package cn.lzy;

import cn.lzy.configbean.Person;
import cn.lzy.configbean.Student;
import cn.lzy.configbean.User;
import cn.lzy.controller.ChapterController;
import cn.lzy.configbean.customconfig.CustomProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

   @Value("${student.id}")
    int id;
    @Autowired
    User user;

    @Autowired
    Person person;

    @Autowired
    CustomProperties customProperties;
    @Test
    public void contextLoads() {
        System.out.println("单元测试返回的数据--" + chapterController.sayHello());
        System.out.println("单元测试返回的student数据--" + student);
        System.out.println("单元测试返回的id数据--" + id);
        System.out.println("单元测试返回的user数据--" + user);
        System.out.println("单元测试返回的person数据--" + person);
    System.out.println("单元测试返回的customproperties数据--" +customProperties);
    }
//    public void  getHello(){
//        String result=chapterController.sayHello();
//        System.out.println(TAG+"单元测试返回==="+result);
//    }
}