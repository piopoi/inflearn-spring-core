package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( //@Component가 붙은 클래스를 스캔해서 스프링 빈으로 등록한다.
        //basePackages = "hello.core.member", //member package만 스캔대상으로 설정한다.
        /*
            excludeFilters : ComponentScan 대상에서 제외할 클래스 설정.
            참고:
            컴포넌트 스캔을 사용하면 @Configuration 이 붙은 설정 정보도 자동으로 등록되기 때문에,
            AppConfig, TestConfig 등 앞서 만들어두었던 설정 정보도 함께 등록되고, 실행되어 버린다.
            그래서 excludeFilters 를 이용해서 설정정보는 컴포넌트 스캔 대상에서 제외했다.
            보통 설정 정보를 컴포넌트 스캔 대상에서 제외하지는 않지만,
            기존 예제 코드를 최대한 남기고 유지하기 위해서 이 방법을 선택했다.
         */
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//    @Autowired MemberRepository memberRepository;
//    @Autowired DiscountPolicy discountPolicy;
//
//    @Bean
//    OrderService orderService() {
//        return new OrderServiceImpl(memberRepository, discountPolicy);
//    }
//
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
