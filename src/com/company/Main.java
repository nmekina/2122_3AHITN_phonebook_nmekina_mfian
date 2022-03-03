package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\nicom\\2122_3AHITN_phonebook_nmekina_mfian\\src\\com\\company\\Telefonbuch.csv");
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(file);

        int i;
        while ((i=fileReader.read()) != -1) {
            System.out.print((char)i);
        }

        fileReader.close();
    }
}
