package com.complexible.common.utils;

import com.complexible.common.base.Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates2 {
	private Dates2() {}
    public static Date asDate(final String theDate) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").parse(theDate);
        } catch (ParseException pe) {
            return Dates.asDate(theDate);
        }
    }

    public static String datetimeISO(Date theDate) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(theDate);
    }
}
