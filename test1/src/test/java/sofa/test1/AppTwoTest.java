package sofa.test1;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTwoTest extends TestCase {
	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTwoTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTwoTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAppTwo()
    {
        assertTrue(true );
        
        Boolean test = false;
        Assert.assertTrue(test);
    }
}
