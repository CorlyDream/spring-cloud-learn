package cc.corly.spring.boot.learn.service.ribbon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    HelloService helloService;

    @GetMapping("hi")
    public String hi(String name) {
        return helloService.hiService(name);
    }
}
