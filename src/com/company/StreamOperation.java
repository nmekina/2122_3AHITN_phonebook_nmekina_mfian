package com.company;

import java.io.*;

/**
 * @author nmekina
 * lest von Console
 */
public class StreamOperation {

    /**
     * @author nmekina
     * fügt in eine Datei eine Person hinzu
     */
    public void ToStream(Writer w, Person p) throws IOException {
        BufferedWriter bw = new BufferedWriter(w);
        bw.newLine();
        bw.write(p.toString());

        bw.close();
    }

    /**
     * @author nmekina
     * lest aus einer Datei eine Person
     */
    public Person fromStream(Reader r) throws IOException {
        BufferedReader br = (BufferedReader) r;
        String data = br.readLine();
        String[] s = data.split(";");
        PhoneNumber pn = null;
        Date d = null;

        try {
            pn = new PhoneNumber(s[4]);
        } catch (IllegalPhoneNumberException e) {
            e.printStackTrace();
        }
        d = new Date(s[3]);

        try {
            d.isValid(d);
        } catch (IllegalDateException e) {
            e.printStackTrace();
        }

        try {
            pn.isValid(pn);
        } catch (IllegalPhoneNumberException e) {
            e.printStackTrace();
        }
        return new Person(s[0], s[1], s[2], d, pn);
    }
}
