package com.company;

public class Date {
    int day, mon, year;

    public Date(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    public Date(String date) {

    }

    public int getDay() {
        return day;
    }

    public int getMon() {
        return mon;
    }

    public int getYear() {
        return year;
    }

    boolean isLeapYear() {
        return true;
    }

    boolean isValid(Date d) {
        return true;
    }
}
