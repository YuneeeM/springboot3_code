package me.yuni.springboot3.controller;

import me.yuni.springboot3.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import me.yuni.springboot3.DAO.Member;

@RestController
public class TestController {

    //Test Service 빈 주입
    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        //멤버목록 얻기
        List<Member> members = testService.getAllMembers();
        return members;
    }


//    @GetMapping("/test")
//    public String test(){
//        return "Hello, world!";
//    }
}
