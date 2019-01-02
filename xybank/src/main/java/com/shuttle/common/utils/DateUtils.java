package com.shuttle.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 日期处理
 */
public class DateUtils {
    private final static Logger logger = LoggerFactory.getLogger(DateUtils.class);
    /**
     * 时间格式(yyyy-MM-dd)
     */
    public final static String DATE_PATTERN = "yyyy-MM-dd";
    /**
     * 时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String format(Date date) {
        return format(date, DATE_PATTERN);
    }

    public static String format(Date date, String pattern) {
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

    /**
     * 字符串转日期
     * @param dateStr  待转字符串
     * @param format  格式
     * @return
     */
    public static Date strToDate(String dateStr, String format){
        if (dateStr == null || "".equals(dateStr) || format == null || "".equals(format)){
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }
    
    /**
     * 计算距离现在多久，非精确
     *
     * @param date
     * @return
     */
    public static String getTimeBefore(Date date) {
        Date now = new Date();
        long l = now.getTime() - date.getTime();
        long day = l / (24 * 60 * 60 * 1000);
        long hour = (l / (60 * 60 * 1000) - day * 24);
        long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        String r = "";
        if (day > 0) {
            r += day + "天";
        } else if (hour > 0) {
            r += hour + "小时";
        } else if (min > 0) {
            r += min + "分";
        } else if (s > 0) {
            r += s + "秒";
        }
        r += "前";
        return r;
    }

    /**
     * 计算距离现在多久，精确
     *
     * @param date
     * @return
     */
    public static String getTimeBeforeAccurate(Date date) {
        Date now = new Date();
        long l = now.getTime() - date.getTime();
        long day = l / (24 * 60 * 60 * 1000);
        long hour = (l / (60 * 60 * 1000) - day * 24);
        long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (l / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        String r = "";
        if (day > 0) {
            r += day + "天";
        }
        if (hour > 0) {
            r += hour + "小时";
        }
        if (min > 0) {
            r += min + "分";
        }
        if (s > 0) {
            r += s + "秒";
        }
        r += "前";
        return r;
    }
    
    /**
     * 当前时间类型   6:00:00 - 17:59:59 这个表示早班(1表示早班)   18:00:00-5:59:59 表示晚班(2表示晚班)
     * @return
     */
    public static String nowType(){
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        if (hour >= 6 && hour <=17){
            return "1";
        } else{
            return "2";
        }
    }
    
    /**
     * 判断当前日期是星期几
     * 
     */
     public static int dayForWeek(Date pTime){
         Calendar c = Calendar.getInstance();
         c.setTime(pTime);
         int dayForWeek = 0;
         if (c.get(Calendar.DAY_OF_WEEK) == 1){
             dayForWeek = 7;
         } else{
             dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
         }
         return dayForWeek;
     }
     
     /**
      * 判断当前日期是星期几
      * 
      * @param pTime 修要判断的时间
      * @return dayForWeek 判断结果
      * @Exception 发生异常
      */
     public static int dayForWeek(String pTime) throws Exception {
         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
         Calendar c = Calendar.getInstance();
         c.setTime(format.parse(pTime));
         int dayForWeek = 0;
         if (c.get(Calendar.DAY_OF_WEEK) == 1){
             dayForWeek = 7;
         } else{
             dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
         }
         return dayForWeek;
     }
     
     public static Map<String,Object> getNextDayTime(){
         Map<String,Object> params = new HashMap<>();
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
          Calendar calendarStart =Calendar.getInstance();
          Calendar calendarEnd =Calendar.getInstance();
          calendarStart.add(calendarStart.DATE,1);
          calendarStart.set(calendarStart.get(Calendar.YEAR), calendarStart.get(Calendar.MONTH), calendarStart.get(Calendar.DATE), 05, 00, 00); 
          calendarEnd.set(calendarStart.get(Calendar.YEAR), calendarStart.get(Calendar.MONTH), calendarStart.get(Calendar.DATE), 07, 00, 00);
          //获取到第二天05-07的时间段
          String calendarStartTime = formatter.format(calendarStart.getTime());
          String calendarEndTime = formatter.format(calendarEnd.getTime());
          params.put("calendarStartTime", calendarStartTime);
          params.put("calendarEndTime", calendarEndTime);
        return params;
    }
     
     
     public static void main(String[] args) {
         System.out.println(dayForWeek(new Date()));
    }
}
