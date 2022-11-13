package cn.itcast.feign.client;

import cn.itcast.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author niecong
 * @date 2022/11/6 8:26
 */

@FeignClient("userservice")
public interface UserClient {

    @GetMapping("/user/{userId}")
    User getUser(@PathVariable Long userId);
}
