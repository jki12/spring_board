package com.example.board.member.controller;

import com.example.board.member.dto.MemberDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@RequiredArgsConstructor
public class MemberController {
    //생성자 주입
    //service 클래스 생성 후 사용
    //private final MemberService memberService;

    //회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("member/save")
    public String save(@ModelAttribute MemberDto memberDto){
        //System.out.println("MemberController.save");
        //System.out.println("memberDto = " + memberDto);
        //memberService.save(memberDto);
        return "login";
    }

    @GetMapping("/member/login")
    public String loginForm(){
        return "login";
    }

    @PostMapping("member/login")
    public String login(@ModelAttribute MemberDto memberDto){
        //System.out.println("MemberController.login");
        //System.out.println("memberDto = " + memberDto);

        //controller, repository, service 부분 연결히고 시용할 부분
        //MemberDto loginResult = memberService.login(memberDto);
/*
        if(loginResult != null){
            //login 성공
            return "main";
        }
        else{
            //login 실패
            return "login";
        }
        */
        return "index";
    }
}
