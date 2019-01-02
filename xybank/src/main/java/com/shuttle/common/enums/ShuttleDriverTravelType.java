package com.shuttle.common.enums;

public enum ShuttleDriverTravelType {

    /**
     * 1、接机
     */
    OUTING_AIRPORT(1, "接机"),
    
    /**
     * 2、接站
     */
    OUTING_STATION(2, "接站"),
    
    /**
     * 2、送机
     */
    GOING_AIRPORT(3, "送机"),
    
    /**
     * 4、送站
     */
    GOING_STATION(4, "送站"),
    
    /**
     * 5、行政调度 去机场
     */
    CENTRE_CONTRO_GO_AIRPORT(5, "行政调度去机场"),
    
    /**
     * 6、行政调度 去车站
     */
    CENTRE_CONTRO_GO_STATION(6, "行政调度去车站"),
    
    /**
     * 7、行政调度 去车库
     */
    CENTRE_CONTRO_GO_GARAGE(7, "行政调度去车库");

    private int code;
    private String name;

    private ShuttleDriverTravelType(int code, String name) {
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
