package com.complexible.pinto;

import com.complexible.common.base.Option;
import org.junit.Before;
import org.junit.Test;
import org.openrdf.model.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BuilderTest {

    private RDFMapper.Builder builderUnderTest;

    @Before
    public void setUp() {
        builderUnderTest = new RDFMapper.Builder();
    }

    @Test
    public void testCollectionFactory() {
        // Setup
        final RDFMapper.CollectionFactory theFactory = null;

        // Run the test
        final RDFMapper.Builder result = builderUnderTest.collectionFactory(theFactory);

        // Verify the results
        assertNotNull(result);
    }

    @Test
    public void testMapFactory() {
        // Setup
        final RDFMapper.MapFactory theMapFactory = null;

        // Run the test
        final RDFMapper.Builder result = builderUnderTest.mapFactory(theMapFactory);

        // Verify the results
        assertNotNull(result);
    }

    @Test
    public void testValueFactory() {
        // Setup
        final ValueFactory theFactory = null;

        // Run the test
        final RDFMapper.Builder result = builderUnderTest.valueFactory(theFactory);

        // Verify the results
        assertNotNull(result);
    }

    @Test
    public void testNamespace() {
        // Setup
        final String thePrefix = "thePrefix";
        final String theNamespace = "theNamespace";

        // Run the test
        final RDFMapper.Builder result = builderUnderTest.namespace(thePrefix, theNamespace);

        // Verify the results
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testNamespace1() {
        // Setup
        final Namespace theNamespace = null;
        final RDFMapper.Builder expectedResult = null;

        // Run the test
        builderUnderTest.namespace(theNamespace);

    }

    @Test
    public void testNamespace1NotNull() {
        // Setup
        final Namespace theNamespace = new Namespace() {
            @Override
            public String getName() {
                return "namespacename";
            }

            @Override
            public String getPrefix() {
                return "namespaceprefix";
            }

            @Override
            public int compareTo(Namespace o) {
                return 0;
            }
        };
        // Run the test
        assertNotNull(builderUnderTest.namespace(theNamespace));

    }

    @Test(expected = NullPointerException.class)
    public void testNamespaces() {
        // Setup
        final Iterable<Namespace> theNamespaces = null;

        // Run the test
        builderUnderTest.namespaces(theNamespaces);

    }


    @Test(expected = NullPointerException.class)
    public void testMap() {
        // Setup
        final IRI theClassURI = null;
        final Class theClass = null;

        // Run the test
        RDFMapper.Builder result = builderUnderTest.map(theClassURI, theClass);
    }

}
