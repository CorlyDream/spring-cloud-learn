package cc.corly.spring.cloud.client.client1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("hi")
    public String sayHi(String name) {
        return "Hi "+name+", client-1, port:2000";
    }
}
