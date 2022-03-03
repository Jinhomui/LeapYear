package com.company;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            System.out.println("Input year is out of range.");
            return false;
        }
        if((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0
                || (year % 4) == 0 && (year % 100) != 0){
            System.out.println("This is a leap year. It has 366 days.");
            return true;
        }
        System.out.println("This is not a leap year.");
        return false;
    }

}
