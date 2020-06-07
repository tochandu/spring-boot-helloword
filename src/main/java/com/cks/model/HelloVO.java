package com.cks.model;

import java.time.Instant;

public class HelloVO {
private String msg;
private Instant curentdatetime;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Instant getCurentdatetime() {
        return curentdatetime;
    }

    public void setCurentdatetime(Instant curentdatetime) {
        this.curentdatetime = curentdatetime;
    }
}
