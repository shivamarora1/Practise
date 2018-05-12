/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shivam
 */
public class BinarySwapTest {
    
    public BinarySwapTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class BinarySwap.
     */
    @Test
    public void testGetNumberOfSwaps(){
        int result=0;
        result=BinarySwap.getNumberOfSwaps("11011", "11001");
        assertEquals("Value Mismatch",-1,result);
        
        result=BinarySwap.getNumberOfSwaps("11010", "10101");
        assertEquals("Value Mismatch",2,result);
        
        result=BinarySwap.getNumberOfSwaps("100110", "11001");
        assertEquals("Value Mismatch",-1,result);
        
        result=BinarySwap.getNumberOfSwaps("11111", "11001");
        assertEquals("Value Mismatch",-1,result);
        
        result=BinarySwap.getNumberOfSwaps("00011010", "10100100");
        assertEquals("Value Mismatch",3,result);
    }
    
}
