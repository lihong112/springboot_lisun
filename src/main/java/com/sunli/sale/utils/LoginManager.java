package com.sunli.sale.utils;


import javax.servlet.http.HttpSession;
import java.util.HashMap;

public class LoginManager {

    private static HashMap mymap = new HashMap();

    public static synchronized void AddLoginflag(String userid, HttpSession session) {
        if (session != null && userid != null) {
            mymap.put(userid, session);
        }
    }

    public static synchronized void DelLoginflag(String userid) {
        HttpSession session = (HttpSession) mymap.get(userid);
        if (session != null) {
            //释放session对象，把该键值对从map中移除
            session.invalidate();
            mymap.remove(userid);
        }
    }

    public static synchronized HttpSession getLoginflag(String userid) {
        if (userid == null) {
            return null;
        }
        return (HttpSession) mymap.get(userid);
    }
}