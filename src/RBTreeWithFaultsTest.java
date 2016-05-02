/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.Assert.*;

/**
 *
 * @author AbeirLaptop
 */
public class RBTreeWithFaultsTest {
    
    public RBTreeWithFaultsTest() {
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
     * Test of getRoot method, of class RBTreeWithFaults.
     */
    @Test
    public void testGetRoot() {
        System.out.println("getRoot");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode expResult = null;
        RBTreeWithFaults.RBNode result = instance.getRoot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNullNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testCreateNullNode() {
        System.out.println("createNullNode");
        RBTreeWithFaults.RBNode parent = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode expResult = null;
        RBTreeWithFaults.RBNode result = instance.createNullNode(parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class RBTreeWithFaults.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class RBTreeWithFaults.
     */
    @Test
    public void testSearchByNull() {
        System.out.println("search");
        int k = 1;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String expResult = null;
        String result = instance.search(k);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of search method, of class RBTreeWithFaults.
     */
    @Test
    public void testSearchKeyNotFound() {
        System.out.println("searchKeyNotFound");
        int k = 4;
//        RBTreeWithFaults.RBNode node = new RBTreeWithFaults.RBNode("value",1,Null);
        RBTreeWithFaults instance = new RBTreeWithFaults();
//        RBTreeWithFaults.RBNode node = instance.new RBNode("value",1, null);
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        String expResult = null;
        String result = instance.search(k);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of search method, of class RBTreeWithFaults.
     */
    @Test
    public void testSearchKeyFound() {
        System.out.println("searchKeyFound");
        int k = 3;
//        RBTreeWithFaults.RBNode node = new RBTreeWithFaults.RBNode("value",1,Null);
        RBTreeWithFaults instance = new RBTreeWithFaults();
//        RBTreeWithFaults.RBNode node = instance.new RBNode("value",1, null);
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        String expResult = "value3";
        String result = instance.search(k);
        assertEquals(expResult, result);
    }
    
    

    /**
     * Test of insert method, of class RBTreeWithFaults.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int k = 0;
        String v = "";
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = instance.insert(k, v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class RBTreeWithFaults.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int k = 0;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = instance.delete(k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of min method, of class RBTreeWithFaults.
     */
    @Test
    public void testMin() {
        System.out.println("min");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String expResult = "";
        String result = instance.min();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class RBTreeWithFaults.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String expResult = "";
        String result = instance.max();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maxValue method, of class RBTreeWithFaults.
     */
    @Test
    public void testMaxValue() {
        System.out.println("maxValue");
        RBTreeWithFaults.RBNode node = null;
        String expResult = "";
        String result = RBTreeWithFaults.maxValue(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keysToArray method, of class RBTreeWithFaults.
     */
    @Test
    public void testKeysToArray() {
        System.out.println("keysToArray");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int[] expResult = null;
        int[] result = instance.keysToArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valuesToArray method, of class RBTreeWithFaults.
     */
    @Test
    public void testValuesToArray() {
        System.out.println("valuesToArray");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String[] expResult = null;
        String[] result = instance.valuesToArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class RBTreeWithFaults.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class RBTreeWithFaults.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sizeCalc method, of class RBTreeWithFaults.
     */
    @Test
    public void testSizeCalc() {
        System.out.println("sizeCalc");
        RBTreeWithFaults.RBNode node = null;
        int expResult = 0;
        int result = RBTreeWithFaults.sizeCalc(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class RBTreeWithFaults.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RBTreeWithFaults.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
