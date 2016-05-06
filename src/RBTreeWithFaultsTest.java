/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

/**
 *
 * @author AbeirLaptop
 */
public class RBTreeWithFaultsTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    public RBTreeWithFaultsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws UnsupportedEncodingException {
        System.setOut(new PrintStream(output, true, "UTF-8"));
    }

    @After
    public void tearDown() {
    }


    /**
     * Test of leftChild method, of class RBTreeWithFaults.
     */
    @Test
    public void testLeftChild() {
        System.out.println("leftChild");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode x = instance.new RBNode("x",1,instance.Root);
        RBTreeWithFaults.RBNode y = instance.new RBNode("y",0,instance.Root);
        RBTreeWithFaults.RBNode expResult = y;
        instance.leftChild(x, y);
        RBTreeWithFaults.RBNode result = x.getLeft();
        assertEquals(expResult,result);
    }

    /**
     * Test of rightChild method, of class RBTreeWithFaults.
     */
    @Test
    public void testRightChild() {
        System.out.println("rightChild");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode x = instance.new RBNode("x",1,instance.Root);
        RBTreeWithFaults.RBNode y = instance.new RBNode("y",2,instance.Root);
        RBTreeWithFaults.RBNode expResult = y;
        instance.rightChild(x, y);
        RBTreeWithFaults.RBNode result = x.getRight();
        assertEquals(expResult,result);

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
        RBTreeWithFaults instance = new RBTreeWithFaults();
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
        RBTreeWithFaults instance = new RBTreeWithFaults();
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
    public void testMinFound() {
        System.out.println("minFound");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(0,"v0");
        instance.insert(1,"v1");
        String expResult = "v0";
        String result = instance.min();
        assertEquals(expResult, result);
    }

    /**
     * Test of min method, of class RBTreeWithFaults.
     */
    @Test
    public void testMinNullTree() {
        System.out.println("minNullTree");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String expResult = null;
        String result = instance.min();
        assertEquals(expResult, result);
    }


    /**
     * Test of max method, of class RBTreeWithFaults.
     */
    @Test
    public void testMaxNullTree() {
        System.out.println("maxNullTree");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        String expResult = null;
        String result = instance.max();
        assertEquals(expResult, result);
    }

    /**
     * Test of max method, of class RBTreeWithFaults.
     */
    @Test
    public void testMaxFound() {
        System.out.println("maxFound");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(0,"v0");
        instance.insert(1,"v1");
        String expResult = "v1";
        String result = instance.max();
        assertEquals(expResult, result);

    }

    /**
     * Test of maxValue method, of class RBTreeWithFaults.
     */
    @Test
    public void testMaxValue() {
        System.out.println("maxValue");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(0,"v0");
        instance.insert(1,"v1");
        String expResult = "v1";
        instance.print();
        String result = instance.maxValue(instance.Root.getLeft());
        assertEquals(expResult, result);
    }


    /**
     * Test of keysToArray method, of class RBTreeWithFaults.
     */
    @Test
    public void testKeysToArray() {
        System.out.println("keysToArray");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(0,"v0");
        instance.insert(1,"v1");
        instance.insert(2,"v2");
        int[] expResult = {0,1,2};
        int[] result = instance.keysToArray();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of keysToArray method, of class RBTreeWithFaults.
     */
    @Test
    public void testKeysToArrayEmpty() {
        System.out.println("keysToArrayEmpty");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int[] expResult = {};
        int[] result = instance.keysToArray();
        assertArrayEquals(expResult, result);

    }
    /**
     * Test of valuesToArray method, of class RBTreeWithFaults.
     */
    @Test
    public void testValuesToArray() {
        System.out.println("valuesToArray");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(0,"v0");
        instance.insert(1,"v1");
        instance.insert(2,"v2");
        String[] expResult = {"v0","v1","v2"};
        String[] result = instance.valuesToArray();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of print method, of class RBTreeWithFaults.
     */
    @Test
    public void testPrint() {
        //System.out.println("print");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(0,"v0");
        instance.insert(1,"v1");
        instance.insert(2,"v2");
        String expResult = "2147483647 Infinity black | \n" +
                "1 v1 black | \n" +
                "0 v0 red | 2 v2 red | \n" +
                "-2147483648 N black | -2147483648 N black | -2147483648 N black | -2147483648 N black | \n";
        instance.print();
        assertEquals(expResult, output.toString());

    }

    /**
     * Test of size method, of class RBTreeWithFaults.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(0,"v0");
        instance.insert(1,"v1");
        instance.insert(2,"v2");
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult,result);
    }

    /**
     * Test of size method, of class RBTreeWithFaults.
     */
    @Test
    public void testSizeEmpty() {
        System.out.println("sizeEmpty");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult,result);
    }

    /**
     * Test of sizeCalc method, of class RBTreeWithFaults.
     */
    @Test
    public void testSizeCalcLowerSide() {
        System.out.println("sizeCalcLowerSide");
        RBTreeWithFaults.RBNode node = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(2, "value2");
        instance.insert(7, "value7");
        instance.insert(5, "value5");
        instance.insert(6, "value6");
        instance.insert(4, "value4");
        node = instance.SearchNode(5,instance.Root);
        int expResult = 5;
        int result = RBTreeWithFaults.sizeCalc(node);
        assertEquals(expResult, result);

    }
    /**
     * Test of sizeCalc method, of class RBTreeWithFaults.
     */
    @Test
    public void testSizeCalcHigherSide() {
        System.out.println("sizeCalcHigherSide");
        RBTreeWithFaults.RBNode node = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(6, "value6");
        instance.insert(4, "value4");
//        instance.insert(8, "value8");
        node = instance.SearchNode(3,instance.Root);
        int expResult = 4;
        instance.print();
        int result = RBTreeWithFaults.sizeCalc(node);
        assertEquals(expResult, result);

    }
    /**
     * Test of sizeCalc method, of class RBTreeWithFaults.
     */
    @Test
    public void testSizeCalcBothSides() {
        System.out.println("sizeCalcBothSides");
        RBTreeWithFaults.RBNode node = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(6, "value6");
        instance.insert(4, "value4");
        instance.insert(8, "value8");
        node = instance.SearchNode(3,instance.Root);
        int expResult = 5;
        instance.print();
        int result = RBTreeWithFaults.sizeCalc(node);
        assertEquals(expResult, result);

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
    @Test
    public void testFixUpTreeRightCase3() {
        System.out.println("fixUpTreeRightCase3");
        RBTreeWithFaults.RBNode z = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(4, "value4");
        instance.insert(5, "value5");
        instance.insert(6, "value6");
        z = instance.SearchNode(5,instance.Root);
        instance.print();
        int expResult = 0;
        int result = instance.fixUpTree(z);
        assertEquals(expResult, result);
    }

    /**
     * Test of fixUpTree method, of class RBTreeWithFaults.
     */
    @Test
    public void testFixUpTreeRightCases12() {
        System.out.println("fixUpTreeRightCases12");
        RBTreeWithFaults.RBNode z = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(5, "value5");
        instance.insert(4, "value4");
        z = instance.SearchNode(4,instance.Root);
        int expResult = 0;
        int result = instance.fixUpTree(z);
        assertEquals(expResult, result);
    }

    /**
     * Test of fixUpTree method, of class RBTreeWithFaults.
     */
    @Test
    public void testFixUpTreeLeftCases() {
        System.out.println("fixUpTreeLeftCases");
        RBTreeWithFaults.RBNode z = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(4, "value4");
        instance.insert(5, "value5");
        instance.insert(6, "value6");
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(0, "value0");
        z = instance.SearchNode(0,instance.Root);
        int expResult = 0;
        int result = instance.fixUpTree(z);
        assertEquals(expResult, result);
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
    @Test
    public void testRightRotate() {
        System.out.println("rightRotate");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1,"y");
        instance.insert(0, "x");
        instance.insert(2,"z");
        RBTreeWithFaults.RBNode x = instance.SearchNode(0,instance.Root);
        RBTreeWithFaults.RBNode y = instance.SearchNode(1,instance.Root);
        RBTreeWithFaults.RBNode expResult = y;
        instance.rightRotate(y);
        RBTreeWithFaults.RBNode result = x.getRight();
        assertEquals(expResult,result);
    }

    /**
     * Test of rightRotate method, of class RBTreeWithFaults.
     */
    @Test
    public void testLeftRotate() {
        System.out.println("leftRotate");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1,"x");
        instance.insert(2, "y");
        RBTreeWithFaults.RBNode x = instance.SearchNode(1,instance.Root);
        RBTreeWithFaults.RBNode y = instance.SearchNode(2,instance.Root);
        RBTreeWithFaults.RBNode expResult = x;
        instance.leftRotate(x);
        RBTreeWithFaults.RBNode result = y.getLeft();
        assertEquals(expResult,result);

    }

    /**
     * Test of deleteFixup method, of class RBTreeWithFaults.
     */
    @Test
    public void testDeleteFixupRightCases13() {
        System.out.println("deleteFixupRightCases1");
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
    public void testDeleteFixupRightCases23() {
        System.out.println("deleteFixupRightCases23");
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
    public void testDeleteFixupLeftAllCases() {
        System.out.println("deleteFixupLeftAllCases");
        RBTreeWithFaults.RBNode x = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(4, "value4");
        instance.insert(5, "value5");
        instance.insert(6, "value6");
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(0, "value0");
        x = instance.SearchNode(1, instance.Root);
        int expResult = 3;
        int result = instance. deleteFixup(x);
        assertEquals(expResult, result);
    }
    /**
     * Test of minimumNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testMinimumNode() {
        System.out.println("minimumNode");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.print();
        RBTreeWithFaults.RBNode node = instance.SearchNode(1,instance.Root);
        RBTreeWithFaults.RBNode expResult = node;
        RBTreeWithFaults.RBNode result = RBTreeWithFaults.minimumNode(instance.Root);
        assertEquals(expResult, result);

    }
    /**
     * Test of minimumNode method, of class RBTreeWithFaults.
     */
    @Test
    public void testMinimumNodeNull() {
        System.out.println("minimumNodeNull");
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode node = instance.createNullNode(instance.Root);
        RBTreeWithFaults.RBNode expResult = null;
        RBTreeWithFaults.RBNode result = RBTreeWithFaults.minimumNode(node);
        assertEquals(expResult, result);

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
    @Test
    public void testArrayOfStringsToArrayOfInts() {
        System.out.println("ArrayOfStringsToArrayOfInts");
        String[] strArr = null;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.print();
        String keyString = instance.ElementsToString(instance.Root, true);
        strArr = keyString.split(",");
        int[] expResult = {1,2,3};
        int[] result = instance.ArrayOfStringsToArrayOfInts(strArr);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of ElementsToString method, of class RBTreeWithFaults.
     */
    @Test
    public void testElementsToStringNull() {
        System.out.println("ElementsToStringNull");
//        RBTreeWithFaults.RBNode node = null;
        boolean key = false;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        RBTreeWithFaults.RBNode node = instance.createNullNode(instance.Root);
        String expResult = "";
        String result = instance.ElementsToString(node, key);
        assertEquals(expResult, result);
    }

    /**
     * Test of ElementsToString method, of class RBTreeWithFaults.
     */
    @Test
    public void testElementsToStringFalse() {
        System.out.println("ElementsToStringFalse");
        boolean key = false;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        String expResult = "value1,value2,value3";
        String result = instance.ElementsToString(instance.Root, key);
        assertEquals(expResult, result);

    }
    /**
     * Test of ElementsToString method, of class RBTreeWithFaults.
     */
    @Test
    public void testElementsToStringTrue() {
        System.out.println("ElementsToStringTrue");
//        RBTreeWithFaults.RBNode node = null;
        boolean key = true;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        String expResult = "1,2,3";
        String result = instance.ElementsToString(instance.Root, key);
        assertEquals(expResult, result);

    }
    /**
     * Test of ElementsToString method, of class RBTreeWithFaults.
     */
    @Test
    public void testElementsToStringNullRight() {
        System.out.println("ElementsToStringNullRight");
        boolean key = true;
        RBTreeWithFaults instance = new RBTreeWithFaults();
        instance.insert(1, "value1");
        instance.insert(2, "value2");
        instance.insert(3, "value3");
        instance.insert(4, "value4");
        String expResult = "1,2,3,4";
        String result = instance.ElementsToString(instance.getRoot(), key);
        assertEquals(expResult, result);

    }


}
