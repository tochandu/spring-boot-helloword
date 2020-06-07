package com.cks.controller;

import com.cks.model.HelloVO;
import com.cks.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/getmsg")
    public String getMsg() {
        return helloService.getHelloMsg();
    }

    @GetMapping("/getmsg/{msg}")
    public ResponseEntity<HelloVO> getMsg(@PathVariable String msg) {
        HelloVO helloVOelloVO=helloService.getCustomMsg(msg);
        return new ResponseEntity<>(helloVOelloVO, HttpStatus.OK);
    }
}
