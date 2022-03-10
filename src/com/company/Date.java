package com.company;

import static com.company.IllegalDateException.DAY_ILLEGAL;
import static com.company.IllegalDateException.MON_ILLEGAL;

/**
 * @author nmekina
 * speichert ein Datum
 */
public class Date {
    int day, mon, year;

    /**
     * @author nmekina
     * Konstruktor für Datum mit einzelnden Teilangaben
     */
    public Date(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    /**
     * @author nmekina
     * Konstruktor für Datum mit String
     */
    public Date(String date) {
        String[] s = date.split("\\.");
        this.day = Integer.parseInt(s[0]);
        this.mon = Integer.parseInt(s[1]);
        this.year = Integer.parseInt(s[2]);
    }

    /**
     * @author nmekina
     * gibt Day zurück
     */
    public int getDay() {
        return day;
    }

    /**
     * @author nmekina
     * gibt Mon zurück
     */
    public int getMon() {
        return mon;
    }

    /**
     * @author nmekina
     * gibt Year zurück
     */
    public int getYear() {
        return year;
    }

    /**
     * @author nmekina
     * gibt zurück, ob es ein Schaltjahr ist
     */
    boolean isLeapYear() {

        return true;
    }

    /**
     * @author nmekina
     * gibt zurück, ob Datum gültig ist
     */
    boolean isValid(Date d) throws IllegalDateException {
        if (d.getDay() >= 32 || d.getDay() <= 0) {
            throw new IllegalDateException(DAY_ILLEGAL);
        } else if (d.getMon() >= 13 || d.getMon() <= 0) {
            throw new IllegalDateException(MON_ILLEGAL);
        }
        return true;
    }

    /**
     * @author nmekina
     * to String für Datum mit entsprechender Ausgabe
     */
    @Override
    public String toString() {
        return this.day + "." + this.mon + "." + this.year;
    }
}
