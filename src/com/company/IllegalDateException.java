package com.company;

public class IllegalDateException {
    int type;
    int DAY_ILLEGAL;
    int MON_ILLEGAL;

    public IllegalDateException(int type, int DAY_ILLEGAL, int MON_ILLEGAL) {
        this.type = type;
        this.DAY_ILLEGAL = DAY_ILLEGAL;
        this.MON_ILLEGAL = MON_ILLEGAL;
    }

    @Override
    public String toString() {
        return "IllegalDateException{" +
                "type=" + type +
                ", DAY_ILLEGAL=" + DAY_ILLEGAL +
                ", MON_ILLEGAL=" + MON_ILLEGAL +
                '}';
    }



}
