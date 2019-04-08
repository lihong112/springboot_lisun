package com.sunli.sale.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    public static Date getMaxMonthDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int actualMaximum = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH,actualMaximum);
        return calendar.getTime();

    }

    public static Date getMinMonthDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int actualMinimum = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH,actualMinimum);
        return calendar.getTime();

    }
}
