package com.complexible.common.utils;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

public class Dates2Test {

    @Before
    public void setup() {
        // so that serialized dates get same TZ as reference data, not local TZ
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Budapest"));
    }

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
