package jpabook.jpashop.repository;

import jpabook.jpashop.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderSearch {
    private String getMemberName;
    private OrderStatus getOrderStatus; //주문 상태 ORDER, CANCEL
}
