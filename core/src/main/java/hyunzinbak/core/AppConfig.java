package hyunzinbak.core;

import hyunzinbak.core.discount.FixDiscountPolicy;
import hyunzinbak.core.member.MemberService;
import hyunzinbak.core.member.MemberServiceImpl;
import hyunzinbak.core.member.MemoryMemberRepository;
import hyunzinbak.core.order.OrderService;
import hyunzinbak.core.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }
}
