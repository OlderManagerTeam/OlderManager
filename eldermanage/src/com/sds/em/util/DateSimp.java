package com.sds.em.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017-05-19.
 */

public class DateSimp {
    public static Date simp(String sDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();
       /* String sDate = "2010-03-26 12:10";
*/
        date = sdf.parse(sDate);
        return date;
    }


    public static String simpToSting(Date date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String str = sdf.format(date);

        return str;
    }



    public static String getDateDays(Date fDate) {

        Calendar aCalendar = Calendar.getInstance();

        aCalendar.setTime(fDate);

        int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);

        aCalendar.setTime(new Date());

        int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);

        return String.valueOf(day1 - day2);

    }

}