package com.company;

/**
 * @author mfian
 */
public class IllegalPhoneNumberException {
    int type;
    int COUNTRY_ILLEGAL;
    int AREA_ILLEGAL;
    int NUMBER_ILLEGAL;
    int STRING_FORMAT_ILLEGAL;

    public IllegalPhoneNumberException(int type, int COUNTRY_ILLEGAL, int AREA_ILLEGAL, int NUMBER_ILLEGAL, int STRING_FORMAT_ILLEGAL) {
        this.type = type;
        this.COUNTRY_ILLEGAL = COUNTRY_ILLEGAL;
        this.AREA_ILLEGAL = AREA_ILLEGAL;
        this.NUMBER_ILLEGAL = NUMBER_ILLEGAL;
        this.STRING_FORMAT_ILLEGAL = STRING_FORMAT_ILLEGAL;
    }

}
