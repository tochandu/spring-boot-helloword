package com.cks.services;

import com.cks.model.HelloVO;

public interface HelloService {
    public String getHelloMsg();
    public HelloVO getCustomMsg(String msg);
}
