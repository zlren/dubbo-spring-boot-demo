package lab.zlren.dubbo.comsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import lab.zlren.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zlren
 * @date 2018-04-01
 */
@RestController
public class ConsumerController {

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}")
    private DemoService demoService;

    @GetMapping("test")
    public String test() {
        return demoService.sayHello("zlren");
    }
}
