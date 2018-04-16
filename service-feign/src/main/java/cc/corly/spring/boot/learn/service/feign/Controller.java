package cc.corly.spring.boot.learn.service.feign;

import cc.corly.spring.boot.learn.service.feign.service.IClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    IClientService clientService;

    @GetMapping("hi")
    public String hi(String name) {
        return clientService.sayHiFromClientOne(name);
    }
}
