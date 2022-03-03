package com.company;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @author nmekina
 * lest von Console ein und aus
 */
public class StreamOperation {

    public void ToStream(Writer w, Person p) throws IOException {
        w.write(p.toString());
    }

    public Person fromStream(Reader r) throws IOException {
        for (int i = r.read(); i != -1; i = r.read()) {
            System.out.print((char) i);
        }
        PhoneNumber pn = new PhoneNumber("0823874");
        Date d = new Date("04043033");
        Person p = new Person("Nico", "Mekina", d, pn);
        return p;
    }
}
