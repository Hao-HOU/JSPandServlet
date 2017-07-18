package com.acehouhao;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * HttpSession事件、监听器
 * Created by Hao HOU on 2017/7/13.
 */
@WebListener
public class OnlineUserCounter implements HttpSessionListener{
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("---------------------------sessionCreated---------------------------");
        OnlineUserCounter.counter++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        OnlineUserCounter.counter--;
    }
}
