package com.company;

import com.sun.jdi.IntegerValue;

import java.nio.charset.StandardCharsets;
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
        String[] s = date.split(".");
        this.day = Integer.parseInt(s[0]);
        this.mon = Integer.parseInt(s[1]);
        this.year = Integer.parseInt(s[2]);
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
        //String input = "31/02/2000";
        String input = d.day + "/" + d.mon + "/" + d.year;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        try {
            LocalDate ld = LocalDate.parse(input, f);
            System.out.println("ld: " + ld);
        } catch (DateTimeParseException e) {
            System.out.println("ERROR: " + e);
        }
        return true;
    }

    @Override
    public String toString() {
        return day + ";" + mon + ";" + year;
    }
}
