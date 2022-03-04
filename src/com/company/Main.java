package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StreamOperation streamOperation = new StreamOperation();
        File file = new File("C:\\Users\\nicom\\2122_3AHITN_phonebook_nmekina_mfian\\src\\com\\company\\Telefonbuch.csv");
        Reader reader = new FileReader(file);
        //Writer writer = new FileWriter(file);

        Date date = new Date(7, 4, 2005);
        PhoneNumber phoneNumber = new PhoneNumber(43, 676, 3519192);
        //Person person = new Person("Nico", "Mekina", date, phoneNumber);
        //streamOperation.ToStream(writer, person);
        streamOperation.fromStream(reader);

        //writer.close();
        reader.close();
    }
}
