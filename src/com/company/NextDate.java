package com.company;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by asus on 2016/11/29.
 */
public class NextDate {
    public Calendar getCalendar() {
        return calendar;
    }

    private Calendar calendar;

    public NextDate() {

    }

    public  void NextDate(int year,int month,int day)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
        calendar.add(Calendar.DAY_OF_YEAR,+1);
        this.calendar= calendar;
    }
}
