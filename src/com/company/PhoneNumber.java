package com.company;

import java.util.IllegalFormatException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.company.IllegalPhoneNumberException.*;

/**
 * @author nmekina
 * speichert eine Telefonnummer
 */
public class PhoneNumber {
    String country;
    int areacode, number;

    /**
     * @author nmekina
     * Konstruktor für Telefonnummer mit einzelnden Teilangaben
     */
    public PhoneNumber(String country, int areacode, int number) {
        this.country = country;
        this.areacode = areacode;
        this.number = number;
    }

    /**
     * @author nmekina
     * Konstruktor für Telefonnummer mit String
     */
    public PhoneNumber(String number) throws IllegalPhoneNumberException {
        try {
            String[] s = number.split(" ");
            String[] s1 = s[1].split("/");
            this.country = s[0];
            this.areacode = Integer.parseInt(s1[0]);
            this.number = Integer.parseInt(s1[1]);
        } catch (Exception e) {
            throw new IllegalPhoneNumberException(STRING_FORMAT_ILLEGAL);
        }
    }

    /**
     * @author nmekina
     * gibt country zurück
     */
    public String getCountry() {
        return country;
    }

    /**
     * @author nmekina
     * gibt areacode zurück
     */
    public int getAreacode() {
        return areacode;
    }

    /**
     * @author nmekina
     * gibt nuber zurück
     */
    public int getNumber() {
        return number;
    }

    /**
     * @author nmekina
     * gibt zurück ob Telefonnummer gültig ist
     */
    public boolean isValid(PhoneNumber p) throws IllegalPhoneNumberException {
        if (p.getCountry() == "+1") {
            throw new IllegalPhoneNumberException(COUNTRY_ILLEGAL);
        } else if (p.getAreacode() == 1234) {
            throw new IllegalPhoneNumberException(AREA_ILLEGAL);
        } else if (p.getNumber() == 8226384) {
            throw new IllegalPhoneNumberException(NUMBER_ILLEGAL);
        }
        return true;
    }

    /**
     * @author nmekina
     * to String für Telefonnummer mit entsprechender Ausgabe
     */
    @Override
    public String toString() {
        return this.country + " " + this.areacode + "/" + this.number;
    }
}
