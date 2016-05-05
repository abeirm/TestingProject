/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
     * Test of createNullNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testCreateNullNode() {
        System.out.println("createNullNode");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode parent = instance.new RBNode("v",1,instance.Root);;
        Boolean expResult = true ;
        RBTreeWithFaults.RBNode resultNode = instance.createNullNode(parent);
        Boolean result = instance.isNullNode(resultNode);
        assertEquals(expResult, result);
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
    public void testInsertRightChild() {
        System.out.println("insertRightChild");
        int k = 0;
        String v = "v";
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int [] expResult = {0,1,2};
        instance.insert(k, v);
        instance.insert(1,"v1");
        instance.insert(2,"v2");
        int [] result = instance.keysToArray();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of insert method, of class RBTreeWithFaults.
     */
    @Test
    public void testInsertNullTree() {
        System.out.println("insertLeftChild");
        int k = 1;
        String v = "v";
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int [] expResult = {1};
        instance.insert(k, v);
        int [] result = instance.keysToArray();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of insert method, of class RBTreeWithFaults.
     */
    @Test
    public void testInsertLeftChild() {
        System.out.println("insertEmptyTreeLeftChild");
        int k = 1;
        String v = "v";
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int [] expResult = {0,1};
        instance.insert(k, v);
        instance.insert(0,"v0");
        int [] result = instance.keysToArray();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of insert method, of class RBTreeWithFaults.
     */
    @Test
    public void testInsertKeyExists() {
        System.out.println("insertKeyExists");
        int k = 0;
        String v = "v";
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = -1;
        instance.insert(0,"v0");
        int result = instance.insert(k, v);;
        assertEquals(expResult, result);

    }

    /**
     * Test of delete method, of class RBTreeWithFaults.
     */
    @Test
    public void testDeleteNotFound() {
        System.out.println("deleteNotFound");
        int k = 1;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(4, "value4");
        int expResult = -1;
        int result = instance.delete(k);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class RBTreeWithFaults.
     */
    @Test
    public void testDeleteValidKeyWithNullLeftChild() {
        System.out.println("deleteValidKeywithNullLeftChild");
        int k = 4;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(4, "value4");
        int expResult = 0;
        int result = instance.delete(k);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class RBTreeWithFaults.
     */
    @Test
    public void testDeleteValidKeyWithNullRightChild() {
        System.out.println("deleteValidKeyWithNullLRightChild");
        int k = 5;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(5, "value5");
        instance.insert(4, "value4");
        int expResult = 1;
        int result = instance.delete(k);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class RBTreeWithFaults.
     */
    @Test
    public void testDeleteValidKeyWithParent() {
        System.out.println("deleteValidKeyAsParent");
        int k = 6;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(6, "value6");
        instance.insert(4, "value4");
        instance.insert(7, "value7");
        instance.insert(5, "value5");
        int expResult = 3;
        int result = instance.delete(k);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class RBTreeWithFaults.
     */
    @Test
    public void testDeleteValidKeyNotParent() {
        System.out.println("deleteValidKeyNotParent");
        int k = 6;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(6, "value6");
        instance.insert(4, "value4");
        instance.insert(8, "value8");
        instance.insert(5, "value5");
        instance.insert(7, "value7");
        int expResult = 0;
        int result = instance.delete(k);
        assertEquals(expResult, result);
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


    /**
     * Test of createInfinityNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testCreateInfinityNode() {
        System.out.println("createInfinityNode");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode leftchild = instance.new RBNode("v",1,instance.Root);;
        Boolean expResult = true ;
        RBTreeWithFaults.RBNode resultNode = instance.createInfinityNode(leftchild);
        Boolean result = instance.isInfinityNode(resultNode);
        assertEquals(expResult, result);

    }

    /**
     * Test of SearchNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testSearchNodeByNull() {
        System.out.println("SearchNodeByNull");
        int k = 2;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode node = instance.createNullNode(instance.Root);
        instance.createInfinityNode(node);
        RBTreeWithFaults.RBNode expResult = null;
        RBTreeWithFaults.RBNode result = instance.SearchNode(k, node);
        assertEquals(expResult, result);
    }

    /**
     * Test of SearchNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testSearchNodeNotFoundLessThan() {
        System.out.println("SearchNodeNotFoundLessThan");
        int k = 3;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode node = instance.new RBNode("value1",1, instance.Root);
        RBTreeWithFaults.RBNode node2 = instance.new RBNode("value2",2, node);
        RBTreeWithFaults.RBNode expResult = node;

        RBTreeWithFaults.RBNode result = instance.SearchNode(k, node);
        System.out.printf("node2: %s  result: %s", node2,result);
        assertEquals(expResult, result);
    }
    /**
     * Test of SearchNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testSearchNodeNotFoundMoreThan() {
        System.out.println("SearchNodeNotFoundMoreThan");
        int k = 0;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode node = instance.new RBNode("value1",1, instance.Root);
        RBTreeWithFaults.RBNode node2 = instance.new RBNode("value2",2, node);
        RBTreeWithFaults.RBNode expResult = node;

        RBTreeWithFaults.RBNode result = instance.SearchNode(k, node);
        System.out.printf("node2: %s  result: %s", node2,result);
        assertEquals(expResult, result);
    }


    /**
     * Test of SearchNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testSearchNodeSuccess() {
        System.out.println("SearchNodeSuccess");
        int k = 2;
        RBTreeWithFaults instance = new RBTreeWithFaults();
//        RBTreeWithFaults.RBNode node = instance.new RBNode("value1",1, instance.Root);
//        RBTreeWithFaults.RBNode node2 = instance.new RBNode("value2",2, node);
        instance.insert(1,"value1");
        instance.insert(2, "value2");
        int expResult = 2;

        RBTreeWithFaults.RBNode resultNode = instance.SearchNode(k, instance.Root);
        int result = resultNode.getKey();
//        System.out.printf("node2: %s  result: %s", node2,result);
        assertEquals(expResult, result);
    }


    /**
     * Test of fixUpTree method, of class RBTreeWithFaults.
     */
    public void testFixUpTree() {
        System.out.println("fixUpTree");
        RBTreeWithFaults.RBNode z = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = instance.fixUpTree(z);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transplate method, of class RBTreeWithFaults.
     */
    @Test
    public void testTransplateLeft() {
        System.out.println("transplateLeft");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1,"value1");
        instance.insert(2,"value2");
        instance.insert(3,"value3");
        RBTreeWithFaults.RBNode x = instance.SearchNode(2,instance.Root);
        RBTreeWithFaults.RBNode y = instance.SearchNode(3,instance.Root);
        instance.transplate(x, y);
        assertEquals(x.getParent().getLeft(),y.getParent().getLeft());
    }

    /**
     * Test of transplate method, of class RBTreeWithFaults.
     */
    @Test
    public void testTransplateRight() {
        System.out.println("transplateRight");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1,"value1");
        instance.insert(2,"value2");
        instance.insert(3,"value3");
        RBTreeWithFaults.RBNode y = instance.SearchNode(2,instance.Root);
        RBTreeWithFaults.RBNode x = instance.SearchNode(3,instance.Root);
        instance.transplate(x, y);
        assertEquals(x.getParent().getRight(),y.getParent().getRight());
    }
    /**
     * Test of leftRotate method, of class RBTreeWithFaults.
     */
    public void testLeftRotate() {
        System.out.println("leftRotate");
        RBTreeWithFaults.RBNode x = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.leftRotate(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rightRotate method, of class RBTreeWithFaults.
     */
    public void testRightRotate() {
        System.out.println("rightRotate");
        RBTreeWithFaults.RBNode y = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.rightRotate(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFixup method, of class RBTreeWithFaults.
     */
    @Test
    public void testDeleteFixupRightCase2() {
        System.out.println("deleteFixupRightCase2");
        RBTreeWithFaults.RBNode x = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(5, "value5");
        instance.insert(4, "value4");
        x = instance.SearchNode(5, instance.Root);
        int expResult = 1;
        int result = instance. deleteFixup(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteFixup method, of class RBTreeWithFaults.
     */
    @Test
    public void testDeleteFixupLeftCase4() {
        System.out.println("deleteFixupLeftCase4");
        RBTreeWithFaults.RBNode x = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(5, "value5");
        instance.insert(4, "value4");
        instance.print();
        x = instance.SearchNode(1, instance.Root);
        int expResult = 1;
        int result = instance. deleteFixup(x);
        assertEquals(expResult, result);
    }
    /**
     * Test of deleteFixup method, of class RBTreeWithFaults.
     */
    @Test
    public void testDeleteFixupLeftCase12() {
        System.out.println("deleteFixupLeftCase12");
        RBTreeWithFaults.RBNode x = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(4, "value4");
        instance.insert(5, "value5");
        instance.insert(6, "value6");


        instance.print();
        x = instance.SearchNode(1, instance.Root);
        int expResult = 4;
        int result = instance. deleteFixup(x);
        assertEquals(expResult, result);
    }
    /**
     * Test of minimumNode method, of class RBTreeWithFaults.
     */
    public void testMinimumNode() {
        System.out.println("minimumNode");
        RBTreeWithFaults.RBNode node = null;
        RBTreeWithFaults.RBNode expResult = null;
        RBTreeWithFaults.RBNode result = RBTreeWithFaults.minimumNode(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNullNode method, of class RBTreeWithFaults.
     */
    public void testIsNullNode() {
        System.out.println("isNullNode");
        RBTreeWithFaults.RBNode node = null;
        boolean expResult = false;
        boolean result = RBTreeWithFaults.isNullNode(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArrayOfStringsToArrayOfInts method, of class RBTreeWithFaults.
     */
    public void testArrayOfStringsToArrayOfInts() {
        System.out.println("ArrayOfStringsToArrayOfInts");
        String[] strArr = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int[] expResult = null;
        int[] result = instance.ArrayOfStringsToArrayOfInts(strArr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ElementsToString method, of class RBTreeWithFaults.
     */
    public void testElementsToString() {
        System.out.println("ElementsToString");
        RBTreeWithFaults.RBNode node = null;
        boolean key = false;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String expResult = "";
        String result = instance.ElementsToString(node, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
