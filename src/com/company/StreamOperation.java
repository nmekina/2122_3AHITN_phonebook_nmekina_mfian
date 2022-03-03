package com.company;

import java.io.Reader;
import java.io.Writer;

/**
 * @author nmekina
 * lest von Console ein und aus
 */
public class StreamOperation {

    void ToStream(Writer w, Person p) {
        System.out.println();
    }

    Person fromStream(Reader r) {
        PhoneNumber pn = new PhoneNumber("0823874");
        Date d = new Date("04043033");
        Person p = new Person("Nico", "Mekina", d, pn);
        return p;
    }
}
