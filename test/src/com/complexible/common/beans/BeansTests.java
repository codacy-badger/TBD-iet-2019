package com.complexible.common.beans;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.stream.StreamSupport;

import org.junit.Test;

import com.complexible.pinto.RDFMapper;

public class BeansTests {

    @Test
    public void isPrimitiveTest(){
        assertTrue(Beans.isPrimitive(Boolean.class));
        assertTrue(Beans.isPrimitive(Integer.class));
        assertTrue(Beans.isPrimitive(Long.class));
        assertTrue(Beans.isPrimitive(Short.class));
        assertTrue(Beans.isPrimitive(Double.class));
        assertTrue(Beans.isPrimitive(Float.class));
        assertTrue(Beans.isPrimitive(Date.class));
        assertTrue(Beans.isPrimitive(String.class));
        assertTrue(Beans.isPrimitive(Character.class));
        assertTrue(Beans.isPrimitive(java.net.URI.class));

        assertFalse(Beans.isPrimitive(RDFMapper.class));
        assertFalse(Beans.isPrimitive(CustomClass.class));
    }

    @Test
    public void fieldsTest(){
        long count = StreamSupport.stream(Beans.getDeclaredFields(CustomClass.class).spliterator(), false).count();
        assertNotEquals(3, count);
        assertTrue(count>=5);
    }
}
