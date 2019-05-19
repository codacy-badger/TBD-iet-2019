package com.complexible.pinto.impl;

import com.complexible.pinto.MappingOptions;
import com.complexible.pinto.RDFMapper;
import com.complexible.pinto.RDFMapperTests;
import com.complexible.pinto.SourcedObject;
import org.junit.Before;
import org.junit.Test;
import org.openrdf.model.Model;

import static org.junit.Assert.assertEquals;

public class SourcedObjectImplTest {
    RDFMapper aMapper;
    RDFMapperTests.Company aCompany;
    SourcedObject sourcedObject;

    @Before
    public void setUp() {
        this.aMapper = RDFMapper.builder().set(MappingOptions.REQUIRE_IDS, true).build();
        this.aCompany = new RDFMapperTests.Company();
        aCompany.setName("Clark & Parsia");
        aCompany.setWebsite("http://clarkparsia.com");
        sourcedObject = new SourcedObjectImpl();
    }

    @Test
    public void testSourceGraph() {
        Model aGraph = aMapper.writeValue(aCompany);

        SourcedObject so = new SourcedObjectImpl();
        so.setSourceGraph(aGraph);

        Model aResult =  so.getSourceGraph();

        // Run the test
        assertEquals(aGraph, aResult);
    }
}
