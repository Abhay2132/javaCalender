package com.mycompany.app;

import java.time.LocalDate;

public class Calender {
    String[] monthNames = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December" };
    String[] weekDayNames = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
            "Sunday" };
    String monthName, weekDayName;

    int day, weekDay, month, year;

    Calender() {
        LocalDate today = LocalDate.now();
        day = today.getDayOfMonth();
        weekDay = today.getDayOfWeek().getValue();
        month = today.getMonthValue();
        year = today.getYear();
        monthName = monthNames[month];
        weekDayName = weekDayNames[weekDay];
    }

    int[] getMonthArr() {
        int[] calender = new int[35];

        return calender;
    }

    boolean isLeapYear (int y){
        return y%4 == 0;
    }

    public String test() {
        String nl = "\n";

        int [] monthArr = new int[35];
        int daysInMonth = 30;
        int weekDayPos = weekDay - (day % 7);

        for(int i=1; i<=daysInMonth; i++){
            monthArr[weekDayPos++] = i;
        }

        String m = "";
        System.out.println("M   T   W   T   F   S   S");

        for(int i = 0; i < weekDayNames.length ; i++){
            
        }
        for(int i = 1; i < monthArr.length +1; i++){
            m = m + (monthArr[i-1]+ (monthArr[i-1] > 9 ? "  " : "   "));
            if(i % 7 == 0) m = m + nl;
        }
        System.out.println(m+nl);

        return nl + "weekDay : " + weekDayName + nl +
                "day : " + day + nl +
                "month : " + monthName + nl +
                "year : " + year + nl;
    }
}
