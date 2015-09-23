package com.company.arrayHelper;



import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Dmytro on 21.09.15.
 */
public class ArrayUnionTest {

    @Test
    public void testMerge(){
        //initialize variable inputs
        int[] left = {1, 5, 4, 23, 65, 32, 78};
        int[] right = {3, 5, 24, 54, 1, 2, 34, 45, 32, 5};

        final int[] EXPECTED_RESULT = {1, 5, 4, 23, 65, 32, 78, 3, 24 ,54  ,2 ,34 ,45};
        // initialize mocks


        //initialize class to test
        ArrayUnion testclass = new ArrayUnion();

        //invoke method on class to test
        int[] returnedValue = testclass.merge(left, right);

        // assert return value
        Assert.assertArrayEquals(EXPECTED_RESULT, returnedValue);

        // verify mock expectations

    }


    @Test
    public void testLefttUnion() throws Exception {
        //initialize variable inputs
        int[] left = {1, 5, 4, 23, 65, 32, 78};
        int[] right = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        final int[] EXPECTED_RESULT = {1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};
        // initialize mocks


        //initialize class to test
        ArrayUnion testclass = new ArrayUnion();

        //invoke method on class to test
        int[] returnedValue = testclass.leftUnion(left, right);

        // assert return value
        Assert.assertArrayEquals(EXPECTED_RESULT, returnedValue);

        // verify mock expectations

    }

    @Test
    public void testLeftUnionWhenLeftArrayIsNull() throws Exception {

        int[] left = null;
        int[] right = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        String expectedResult = "Your left array is null";
        // initialize mocks


        //initialize class to test
        ArrayUnion testclass = new ArrayUnion();

        //invoke method on class to test
        try {
            int[] returnedValue = testclass.leftUnion(left, right);
            fail("Exception should be thrown");
        }catch (ArrayNullPointerException e){
            assertEquals(expectedResult, e.getMessage());
        }
    }

    @Test
    public void testLeftUnionWhenRightArrayIsNull() throws Exception {
        //initialize variable inputs
        int[] left = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] right = null;


        String expectedValue = "Your right array is null";
        // initialize mocks


        //initialize class to test
        ArrayUnion testclass = new ArrayUnion();

        //invoke method on class to test
        try{
            int[] returnedValue = testclass.leftUnion(left, right);
            fail("Exception should be thrown");
        }catch (Exception e){
            Assert.assertEquals(expectedValue, e.getMessage());
        }
        // assert return value
        // verify mock expectations
    }

    @Test
    public void testLeftUnionWithEmptyLeftArray() {

        int[] left = new int[0];
        int[] right = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        final int[] EXPECTED_RESULT = {};

        ArrayUnion testclass = new ArrayUnion();

        //invoke method on class to test
        int[] returnedValue = testclass.leftUnion(left, right);

        // assert return value
        Assert.assertArrayEquals(EXPECTED_RESULT, returnedValue);

        // verify mock expectations
    }

    @Test
    public void testLeftUnionwithEmptyRightArray() {

        int[] left = {1, 5, 4, 23, 65, 32, 78};
        int[] right = {};

        final int[] EXPECTED_RESULT = Arrays.copyOf(left, left.length);

        ArrayUnion testClass = new ArrayUnion();
        int[] result = testClass.leftUnion(left, right);

        Assert.assertArrayEquals(EXPECTED_RESULT, result);
    }
}