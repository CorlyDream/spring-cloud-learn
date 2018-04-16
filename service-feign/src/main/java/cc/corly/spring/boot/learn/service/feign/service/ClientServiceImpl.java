package cc.corly.spring.boot.learn.service.feign.service;

import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "feign forry:"+name;
    }
}
