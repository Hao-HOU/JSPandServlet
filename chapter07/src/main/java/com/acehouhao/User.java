package com.acehouhao;

import java.io.Serializable;

/**
 * Created by Hao HOU on 2017/7/26.
 */
public class User implements Serializable {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid() {
        return "houhao".equals(name) && "123".equals(password);
    }
}
