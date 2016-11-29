package com.company;

import org.junit.Test;

import java.util.Calendar;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by asus on 2016/11/29.
 */
public class NextDateTest {
    NextDate nextDate = new NextDate();
    @Test
    public void nextDate() throws Exception {
        int year = 2012;
        int month = 1;
        int day = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day+1);
        nextDate.NextDate(year,month,day);
        System.out.print(calendar.getTime()+"\n");
        System.out.print(nextDate.getCalendar().getTime());
        String a1= calendar.getTime().toString();
        String a2 = nextDate.getCalendar().getTime().toString();
        assertTrue(Objects.equals(a1, a2));
    }

}