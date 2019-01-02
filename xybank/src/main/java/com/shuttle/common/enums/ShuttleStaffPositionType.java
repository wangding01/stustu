package com.shuttle.common.enums;

/**
 * 人员职位类型 
 * @author dongao
 *
 */
public enum ShuttleStaffPositionType {

    /**
     * 1、机场调度员
     */
    JC_DDY(1, "机场调度员"),
    
    /**
     * 2、车站调度员
     */
    CZ_DDY(2, "车站调度员"),
    
    /**
     * 3、车库调度员
     */
    CK_DDY(3, "车库调度员"),
    
    /**
     * 4、机场验票员
     */
    JC_YPY(4, "机场验票员"),
    
    /**
     * 5、车站验票员
     */
    CZ_YPY(5, "车站验票员"),
    
    
    /**
     * 6、司机
     */
    SJ(6, "司机");

    private int code;
    private String name;

    private ShuttleStaffPositionType(int code, String name) {
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
