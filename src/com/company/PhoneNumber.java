package com.company;

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

    boolean isValid(PhoneNumber b) {
        return true;
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
