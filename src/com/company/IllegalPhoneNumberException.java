package com.company;

/**
 * @author mfian
 */
public class IllegalPhoneNumberException extends Exception{
    int type;
    public static final int COUNTRY_ILLEGAL = 1;
    public static final int AREA_ILLEGAL = 2;
    public static final int NUMBER_ILLEGAL = 3;
    public static final int STRING_FORMAT_ILLEGAL = 4;

    public IllegalPhoneNumberException(int type) {
        this.type = type;
        if (this.type == COUNTRY_ILLEGAL) {
            System.out.println("Illegale country!!!!");
        } else if (this.type == AREA_ILLEGAL) {
            System.out.println("Illegale area!!!!");
        } else if (this.type == NUMBER_ILLEGAL) {
            System.out.println("Illegale Nummer!!!!");
        } else if (this.type == STRING_FORMAT_ILLEGAL) {
            System.out.println("Illegales String-Format!!!!");
        }
    }

}
