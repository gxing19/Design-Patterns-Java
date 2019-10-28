package com.designpatterns.creational.prototype;

import java.util.HashMap;

public class ProtoTypeManager {

    private HashMap<String, IMail> map = new HashMap<>();

    public ProtoTypeManager() {
        map.put("newYear", new HappyNewYearMail());
        map.put("birthday", new BirthdayGreetingMail());
    }

    public void addMail(String key, IMail mail) {
        map.put(key, mail);
    }

    public IMail getMail(String key) throws CloneNotSupportedException {
        IMail mail = map.get(key);
        return (BirthdayGreetingMail) mail.clone();
    }
}
