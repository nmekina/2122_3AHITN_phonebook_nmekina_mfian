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

    public boolean isValid(String s) {
        Pattern p = Pattern.compile("/(?:\\(\\+?\\d+\\)|\\+?\\d+)(?:\\s*[\\-\\/]*\\s*\\d+)+/");
        Matcher m = p.matcher(s);
        if (m.find()){
            System.out.printf(m.group());
        }
        return true;

/*
        for (int i = 0; i < numbers.length; i++) {
            String phoneNumber=numbers[i];
            //nur für test
            if (isValid(phoneNumber))
                System.out.print(phoneNumber+" ist telenummer");
            else
                System.out.print(phoneNumber+" keine telenummer");

 */
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
