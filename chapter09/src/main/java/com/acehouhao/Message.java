package com.acehouhao;

import java.io.Serializable;

/**
 * Created by Hao HOU on 2017/7/29.
 */
public class Message implements Serializable {
    private long id;
    private String name;
    private String email;
    private String msg;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
