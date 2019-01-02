package com.shuttle.common.enums;

/**
 * 车辆状态
 * @author dongao
 * @date 2018-3-6 17:47:49
 */
public enum ShuttleCarStatusEnum {
    /**
     * 1、不在服务
     */
    NO_SERVICE(1, "不在服务"),

    /**
     * 2、车库等待
     */
    GARAGE_WAIT(2, "车库等待"),

    /**
     * 3、送机准备
     */
    GO_AIRPORT_READY(3, "送机准备"),

    /**
     * 4、送机送客
     */
    GO_AIRPORT_TRANSPORT(4, "送机送客"),

    /**
     * 5、机场等待
     */
    AIRPLANE_WAIT(5, "机场等待"),
    
    /**
     * 6、接机准备
     */
    OUT_AIRPORT_READY(6, "接机准备"),
    
    /**
     * 7、接机出发
     */
    OUT_AIRPORT_LEAVE(7, "接机出发"),
    
    /**
     * 8、接机送客
     */
    OUT_AIRPORT_TRANSPORT(8, "接机送客"),
    
    /**
     * 9、行政调度
     */
    CENTRE_CONTRO(9, "行政调度"),
    
    /**
     * 10、送站准备
     */
    GO_STATION_READY(10, "送站准备"),
    
    /**
     * 11、送站送客
     */
    GO_STATION_TRANSPORT(11, "送站送客"),
    
    /**
     * 12、车站等待
     */
    STATION_WAIT(12, "车站等待"),
    
    /**
     * 13、接站准备
     */
    OUT_STATION_READY(13, "接站准备"),
    
    /**
     * 14、接站出发
     */
    OUT_STATION_LEAVE(14, "接站出发"),
    
    /**
     * 15、接站送客
     */
    OUT_STATION_TRANSPORT(15, "接站送客"),
    
    /**
     * 16、锁定状态
     */
    STATION_LOCKING(16, "车站锁定状态"),
    
    /**
     * 17、行政调度 去机场
     */
    CENTRE_CONTRO_GO_AIRPORT(17, "行政调度去机场"),
    
    /**
     * 18、行政调度 去车站
     */
    CENTRE_CONTRO_GO_STATION(18, "行政调度去车站"),
    
    /**
     * 19、行政调度 去车库
     */
    CENTRE_CONTRO_GO_GARAGE(19, "行政调度去车库"),
    
    /**
     * 20、机场锁定状态
     */
    AIRPORT_LOCKING(20, "机场锁定状态");

    private int code;
    private String name;

    private ShuttleCarStatusEnum(int code, String name) {
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
