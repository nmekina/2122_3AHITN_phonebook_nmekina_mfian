package com.company;

/**
 * @author mfian
 */
public class IllegalDateException extends Exception{
    int type;
    public static final int DAY_ILLEGAL = 1;
    public static final int MON_ILLEGAL = 2;

    public IllegalDateException(int type) {
        this.type = type;
        if (this.type == DAY_ILLEGAL) {
            System.out.println("Illegaler Tag!!!!");
        } else if (this.type == MON_ILLEGAL) {
            System.out.println("Illegaler Monat!!!!");
        }
    }

}
