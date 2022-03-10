package com.company;

import java.io.*;
import java.util.ArrayList;

import static com.company.IllegalPhoneNumberException.STRING_FORMAT_ILLEGAL;

public class Main {

    public static void main(String[] args) throws IOException {
        StreamOperation streamOperation = new StreamOperation();
        File file = new File("Telefonbuch.csv");
        Reader reader = new FileReader(file);
        ArrayList<Date> a = new ArrayList<>();
        BufferedReader br = new BufferedReader(reader);
        br.readLine();

        while (br.ready()) {
            Person person = streamOperation.fromStream(br);
            a.add(person.birthday);
        }

        for (int i = 0; i < a.size(); i++) {
            System.out.println("Date: " + a.get(i));
        }

        Date date = new Date(7, 4, 2005);
        PhoneNumber phoneNumber = null;
        try {
            phoneNumber = new PhoneNumber("+43 677/8226384");
            Person person = new Person("Nico", "Mekina", "nmekina", date, phoneNumber);

            Writer writer = new FileWriter(file, true);
            streamOperation.ToStream(writer, person);
            writer.close();
        } catch (IllegalPhoneNumberException e) {
            //e.printStackTrace();
        }
    }
}
