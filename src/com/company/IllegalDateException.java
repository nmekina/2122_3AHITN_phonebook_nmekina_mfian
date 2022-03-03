package com.company;

/**
 * @author mfian
 */
public class IllegalDateException {
    int type;
    int DAY_ILLEGAL;
    int MON_ILLEGAL;

    public IllegalDateException(int type, int DAY_ILLEGAL, int MON_ILLEGAL) {
        this.type = type;
        this.DAY_ILLEGAL = DAY_ILLEGAL;
        this.MON_ILLEGAL = MON_ILLEGAL;
    }

}
