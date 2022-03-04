package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author nmekina
 * speichert eine Telefonnummer
 */
public class PhoneNumber {
    int country, areacode, number;

    public PhoneNumber(int country, int areacode, int number) {
        this.country = country;
        this.areacode = areacode;
        this.number = number;
    }

    public PhoneNumber(String number) {

    }

    public int getCountry() {
        return country;
    }

    public int getAreacode() {
        return areacode;
    }

    public int getNumber() {
        return number;
    }

    public static boolean isValid(String s) {
        Pattern p = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$");
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));

        String phoneNumbers = country + areacode + number;

        for (int i = 0; i < phoneNumbers.length; i++) {
            String phoneNumber=phoneNumbers[i];
            if (isValid(phoneNumber))
                System.out.print(phoneNumber+" ist telenummer");
            else
                System.out.print(phoneNumber+" keine telenummer");
        }


    @Override
    public String toString() {
        return "PhoneNumber{" +
                "country=" + country +
                ", areacode=" + areacode +
                ", number=" + number +
                '}';

    }
}
