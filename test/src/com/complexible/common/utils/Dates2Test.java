package com.complexible.common.utils;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class Dates2Test {

    @Test
    public void testAsDate() {
        // Setup
        final String theDate = "2019-05-20";
        final Date expectedResult = new GregorianCalendar(2019, 4, 20,00,00,00).getTime();

        // Run the test
        final Date result = Dates2.asDate(theDate);

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public void testDatetimeISO() {
        // Setup
        final Date theDate = new GregorianCalendar(2017, 0, 1, 0, 0, 0).getTime();
        final String expectedResult = "2017-01-01T00:00:00.000+01:00";

        // Run the test
        final String result = Dates2.datetimeISO(theDate);

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
