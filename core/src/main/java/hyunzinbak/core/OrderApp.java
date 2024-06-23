package hyunzinbak.core;

import hyunzinbak.core.member.Grade;
import hyunzinbak.core.member.Member;
import hyunzinbak.core.member.MemberService;
import hyunzinbak.core.member.MemberServiceImpl;
import hyunzinbak.core.order.Order;
import hyunzinbak.core.order.OrderService;
import hyunzinbak.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
