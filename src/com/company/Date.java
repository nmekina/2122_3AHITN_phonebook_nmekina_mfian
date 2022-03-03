package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * @author nmekina
 * speichert ein Datum
 */
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

        //String;  Datum von IllegalDateException
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        try {
            LocalDate ld = LocalDate.parse(input, f);
            System.out.println("ld: " + ld);
        } catch (DateTimeParseException e) {
            System.out.println("ERROR: " + e);
        }
    }
}
