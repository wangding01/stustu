package com.shuttle.common.enums;

/**
 * 出车状态  
 * 1、出车准备中； 2、出车中； 3、出车完毕；
 * @author Lenovo
 *
 */
public enum ShuttleDriverTravelStatus {

    /**
     * 1、出车准备中
     */
    TRAVEL_PLAN(1, "出车准备中"),
    
    /**
     * 2、出车中
     */
    TRAVELLING(2, "出车中"),
    
    /**
     * 3、出车完毕
     */
    TRAVEL_SUCC(3, "出车完毕");

    private int code;
    private String name;

    private ShuttleDriverTravelStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
