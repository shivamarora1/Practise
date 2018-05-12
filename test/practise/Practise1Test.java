/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shivam
 */
public class Practise1Test {
    
    public Practise1Test() {
    }

    /**
     * Test of main method, of class Practise1.
     */
    @Test
    public void testMain() {
        String res;
        res = Practise1.whoWins(12,2,3);
        assertEquals("Method Failed..","Rahul",res);
        res = Practise1.whoWins(5.23,0.0002,3.23567);
        assertEquals("Method Failed..","Rahul",res);
       
    }
    
}
