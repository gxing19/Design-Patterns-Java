package com.gxitsky.behavioral.chain_responsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc 请假单
 * @author gxing
 * @date 2022/3/29 16:43
 */
public class TakeLeave {

    private String name;
    private String role;
    private Integer days;
    private Map<String, String> statusMap = new HashMap<>();

    public TakeLeave() {
    }

    public TakeLeave(String name, Integer days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public TakeLeave setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getDays() {
        return days;
    }

    public TakeLeave setDays(Integer days) {
        this.days = days;
        return this;
    }

    public Map<String, String> getStatusMap() {
        return statusMap;
    }

    public String getRole() {
        return role;
    }

    public TakeLeave setRole(String role) {
        this.role = role;
        return this;
    }

    public TakeLeave setStatusMap(Map<String, String> statusMap) {
        this.statusMap = statusMap;
        return this;
    }


}
