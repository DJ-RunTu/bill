package com.mengxuegu.springboot.interceptor;

import jdk.nashorn.internal.objects.annotations.Getter;

public enum  UserType {
    ADMIN(1);
    private Integer  code;

    public Integer getCode() {
        return code;
    }

    UserType(int i) {
    }
}
