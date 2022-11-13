package cn.itcast.user.prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author niecong
 * @date 2022/11/6 8:34
 */
@Component
@Data
@ConfigurationProperties(prefix = "pattern")
public class CommonProperties {
    String dateFormat;
    String envShareValue;
}
