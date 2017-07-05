package com.acehouhao;

import java.util.HashMap;
import java.util.Map;

/**
 * 模型
 * Created by Hao HOU on 2017/7/5.
 */
public class HelloModel {
    private Map<String, String> messages = new HashMap<>();
    public HelloModel() {
        messages.put("caterpillar", "Hello");
        messages.put("Justin", "Welcome");
        messages.put("momor", "Hi");
    }

    public String doHello(String user) {
        String message = messages.get(user);
        return message + ", " + user + "!";
    }
}
