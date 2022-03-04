package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\nicom\\2122_3AHITN_phonebook_nmekina_mfian\\src\\com\\company\\Telefonbuch.csv");
        Reader reader = new FileReader(file);
        Writer writer = new FileWriter(file);

        StreamOperation streamOperation = new StreamOperation();
        Date date = new Date(2, 9, 1945);
        PhoneNumber phoneNumber = new PhoneNumber(43, 676, 3519192);
        Person person = new Person("Nico", "Mekina", date, phoneNumber);
        streamOperation.fromStream(reader);
        streamOperation.ToStream(writer, person);

        writer.close();
        reader.close();
    }
}
