package com.company;

/**
 * @author nmekina
 * speichert Daten zu einer bestimmten< Person
 */
public class Person {
    String name, givenname, nickname;
    Date birthday;
    PhoneNumber phone;

    public Person(String name, String givenname, String nickname, Date birthday, PhoneNumber phone) {
        this.name = name;
        this.givenname = givenname;
        this.birthday = birthday;
        this.phone = phone;
        this.nickname = nickname;
    }


    @Override
    public String toString() {
        return name + ";" + givenname + ";" + nickname + ";" + birthday.toString() + ";" + phone.toString();
        //Mickey;Mouse;Mick;13.01.1930;+1 1234/12345678
    }
}
