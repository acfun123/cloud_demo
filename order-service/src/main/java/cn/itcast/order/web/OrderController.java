package cn.itcast.order.web;

import cn.itcast.feign.client.UserClient;
import cn.itcast.order.pojo.Order;
import cn.itcast.feign.pojo.User;
import cn.itcast.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    UserClient userClient;

    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
        Order order = orderService.queryOrderById(orderId);
        User user = userClient.getUser(order.getUserId());
        order.setUser(user);
        return order;
    }

    @GetMapping("hello")
    public String hello(@RequestHeader("Truth") String truth){
        return truth;
    }
}
