package com.miaosha.redis;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class UserKey extends BasePrefix{

    private UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("name");
}
