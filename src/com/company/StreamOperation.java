package com.company;

import java.io.*;
import java.util.stream.Collectors;

/**
 * @author nmekina
 * lest von Console ein und aus
 */
public class StreamOperation {

    public void ToStream(Writer w, Person p) throws IOException {
        w.write(p.toString());
        w.close();
    }

    public Person fromStream(Reader r) throws IOException {
        BufferedReader br = new BufferedReader(r);
        if (!(br.read()>0)){
            System.out.println("NULL");
            return null;
        }
        String[] s = br.readLine().split(";");

        PhoneNumber pn = new PhoneNumber(s[4].toString());
        Date d = new Date(s[3].toString());
        Person p = new Person(s[0], s[1], s[2], d, pn);
        System.out.println(p.toString());

        return p;
    }
}
