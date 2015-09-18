package com.company;

import java.util.Arrays;

/**
 * Created by Dmytro on 18.09.15.
 */
public class ArrayUnion {

    private int[] left;
    private int[] right;

    public ArrayUnion(int[] left,int[] right){
        this.left = left;
        this.right = right;
    }

    public ArrayUnion() {
    }

    public int[] leftUnion(int[] left, int[] right) {

        int length = left.length;

        int[] copy = Arrays.copyOf(left, left.length);


        int count = 0;

        Arrays.sort(copy);

        for (int i : right) {
            int index = Arrays.binarySearch(copy, i);
            if(index > -1)
                count++;
        }

        length += count;


        int[] result = Arrays.copyOf(left, length);

        int i = left.length;

        for (int j = 0; i < result.length; j++) {
            int index = Arrays.binarySearch(copy, right[j]);
            if(index > -1) {
                result[i] = right[j];


                ///
                i++;
            }
        }

        return result;
    }


    public static boolean checkArrays(int[] result, int[] true_result) {
        if( result.length != true_result.length)
            return false;

        for (int i = 0; i < result.length; i++) {
            if (result[i] != true_result[i])
                return false;
        }

        return true;

    }
}
