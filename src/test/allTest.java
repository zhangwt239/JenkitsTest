package test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class allTest extends TestCase{
	 public static Test suite ()  
	    {  
	        TestSuite ts = new TestSuite();  
	        ts.addTestSuite(myTest.class);    
	        return ts;  
	    }  
}