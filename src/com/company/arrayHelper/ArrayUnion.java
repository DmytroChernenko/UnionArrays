package com.company.arrayHelper;

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

    public int[] leftUnion(int[] left, int[] right) throws ArrayNullPointerException{

        if(left == null)
            throw new ArrayNullPointerException("Your left array is null");
        else if(right == null)
            throw new ArrayNullPointerException("Your right array is null");

        int lengthOfResultArray = left.length;
        int[] copy = Arrays.copyOf(left, left.length);

        int count = 0;

        Arrays.sort(copy);

        for (int i : right) {
            int index = Arrays.binarySearch(copy, i);
            if(index > -1)
                count++;
        }

        lengthOfResultArray += count;


        int[] result = Arrays.copyOf(left, lengthOfResultArray);

        int i = left.length;

        for (int j = 0; i < result.length; j++) {
            int index = Arrays.binarySearch(copy, right[j]);
            if(index > -1) {
                result[i] = right[j];
                i++;
            }
        }

        return result;
    }

    public int[] merge(int[] leftArray, int[] rightArray) {

        if(leftArray == null)
            throw new ArrayNullPointerException("Your left array is null");
        else if(rightArray == null)
            throw new ArrayNullPointerException("Your right array is null");

        int lengthOfResultArray = leftArray.length;
        int[] copy = Arrays.copyOf(leftArray, leftArray.length);

        int count = 0;

        Arrays.sort(copy);

        for (int element : rightArray) {
            int index = Arrays.binarySearch(copy, element);
            if(index < 0)
                count++;
        }

        lengthOfResultArray += count;


        int[] result = Arrays.copyOf(leftArray, lengthOfResultArray);

        int i = leftArray.length;

        for (int j = 0; i < result.length; j++) {
            int index = Arrays.binarySearch(copy, rightArray[j]);
            if(index < 0) {
                result[i] = rightArray[j];
                i++;
            }
        }

        return result;
    }
}
