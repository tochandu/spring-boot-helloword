package com.cks.services.impl;

import com.cks.model.HelloVO;
import com.cks.services.HelloService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHelloMsg() {
        return "Hello World! First App";
    }

    @Override
    public HelloVO getCustomMsg(String msg) {
        HelloVO helloVO = new HelloVO();
        helloVO.setMsg(msg);
        helloVO.setCurentdatetime(Instant.now());
        return helloVO;
    }
}
