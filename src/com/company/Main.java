package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception{
	    // write your code here
        int[] left = {1, 5, 4, 23, 65, 32, 78};
        int[] right = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};

        final int[] TRUE_RESULT = {1, 5, 4, 23, 65, 32, 78, 5, 4, 1, 32, 5};

        ArrayUnion arrayUnion = new ArrayUnion();

        int[] result = arrayUnion.leftUnion(left, right);

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(TRUE_RESULT));

    }
}
