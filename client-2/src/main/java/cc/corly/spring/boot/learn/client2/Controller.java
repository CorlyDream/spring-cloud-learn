package cc.corly.spring.boot.learn.client2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("hi")
    public String sayHi(String name) {
        return "Hi "+name+", client-2, port:2001";
    }
}
