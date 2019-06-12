package TestGUI;

import BackEnd.Decorator.Car;
import Frontend.CRUserFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CRUserFrameTest {
    
    public CRUserFrameTest() {
    }
    
     /**
     * Test of GetSelectedExtraValue method, of class CRUserFrame.
     * It's tests the default combobox value.
     */
    @Test
    public void testGetSelectedExtraValue() {
        System.out.println("Testing GetSelectedExtraValue");
        CRUserFrame instance = new CRUserFrame();
        String expResult = "Warrantee";
        String notExpResult = "";
        String result = instance.GetSelectedExtraValue();
        assertEquals(expResult, result);
        assertNotEquals(notExpResult,result);
        assertNotEquals(null,result);
    }
    
    /**
     * Test of GetSelectedCarValue method, of class CRUserFrame.
     * It's tests the tha label is really empty while the user doesn't buy a car.
     */
    @Test 
    public void testGetSelectedCarValue(){
        System.out.println("Testing GetSelectedCarValue");
        CRUserFrame instance = new CRUserFrame();
        String expResult = "";
        String result = instance.GetSelectedCarValue();
        assertEquals(expResult,result);
        
    }
    
}
