/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author suprina
 */
public class BoxTest {
      public BoxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     *  addProduct method,class Box.
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product product = null;
        Box instance = null;
        instance.addProduct(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * addProduct method,class Box.
     */
    @Test
    public void testAddProduct_Product_int() {
        System.out.println("addProduct");
        Product product = null;
        int quantity = 0;
        Box instance = null;
        instance.addProduct(product, quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * getLabel method, class Box.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Box instance = null;
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * toString method, class Box.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Box instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *  getTotalWeight method,class Box.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * canFit method, class Box.
     */
    @Test
    public void testCanFit_Product() {
        System.out.println("canFit");
        Product p = null;
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.canFit(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * canFit method,class Box.
     */
    @Test
    public void testCanFit_Product_int() {
        System.out.println("canFit");
        Product p = null;
        int quantity = 0;
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.canFit(p, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *  remainingCapacity method,class Box.
     */
    
    @Test
    public void testRemainingCapacity() {
        System.out.println("remainingCapacity");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.remainingCapacity();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Fragile method, class Box.
     */
    @Test
    public void testIsFragile() {
        System.out.println("isFragile");
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.isFragile();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }

    /**
     * Hazardous method,class Box.
     */
    @Test
    public void testIsHazardous() {
        System.out.println("isHazardous");
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.isHazardous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
