package com.shuttle.common.enums;

/**
 * 司机状态
 * @author dongao
 * @date 2018-3-6 17:47:49
 */
public enum ShuttleDriverStatusEnum {
    /**
     * 1、不在服务
     */
    NO_SERVICE(1, "不在服务"),

    /**
     * 2、等待发车
     */
    WAIT(2, "等待发车"),

    /**
     * 3、送机中
     */
    GOING_AIRPORT(3, "送机中"),

    /**
     * 4、调度中
     */
    CONTROING(4, "调度中"),

    /**
     * 5、发车中
     */
    LEAVEING(5, "发车中"),
    
    /**
     * 6、接机中
     */
    OUTING_AIRPORT(6, "接机中"),
    
    /**
     * 7、送站中
     */
    GOING_STATION(7, "送站中"),
    
    /**
     * 8、接站中
     */
    OUTING_STATION(8, "接站中");

    private int code;
    private String name;

    private ShuttleDriverStatusEnum(int code, String name) {
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
