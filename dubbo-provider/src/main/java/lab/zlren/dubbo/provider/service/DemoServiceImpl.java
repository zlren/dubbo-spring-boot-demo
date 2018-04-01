package lab.zlren.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import lab.zlren.dubbo.api.DemoService;

@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
