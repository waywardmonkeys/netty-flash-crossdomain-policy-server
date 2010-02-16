package com.waywardmonkeys.flashpolicyd;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple FlashPolicyServer.
 */
public class FlashPolicyServerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FlashPolicyServerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FlashPolicyServerTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testFlashPolicyServer()
    {
        assertTrue( true );
    }
}
