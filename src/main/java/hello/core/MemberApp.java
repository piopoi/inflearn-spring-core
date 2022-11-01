package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
        //without Spring Framework
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        //with Spring Framework
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        //join member
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        //find member
        Member findMember = memberService.findMember(1L);

        //print out
        System.out.println("new Member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
