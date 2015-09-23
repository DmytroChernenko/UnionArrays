package com.company.arrayHelper;

import java.util.Arrays;

/**
 * Created by Dmytro on 23.09.15.
 */
public class ArrayHelper<T> {


    public T[] leftUnion(T[] leftArray, T[] rightArray){
        if(leftArray == null)
            throw new ArrayNullPointerException("Your left array is null");
        else if(rightArray == null)
            throw new ArrayNullPointerException("Your right array is null");

        int lengthOfResultArray = leftArray.length;
        T[] copy = Arrays.copyOf(leftArray, leftArray.length);

        int count = 0;

        Arrays.sort(copy);

        for (T element : rightArray) {
            int index = Arrays.binarySearch(copy, element);
            if(index > -1)
                count++;
        }

        lengthOfResultArray += count;


        T[] result = Arrays.copyOf(leftArray, lengthOfResultArray);

        int i = leftArray.length;

        for (int j = 0; i < result.length; j++) {
            int index = Arrays.binarySearch(copy, rightArray[j]);
            if(index > -1) {
                result[i] = rightArray[j];
                i++;
            }
        }

        return result;

    }

    public T[] merge(T[] leftArray, T[] rightArray) {

        if(leftArray == null)
            throw new ArrayNullPointerException("Your left array is null");
        else if(rightArray == null)
            throw new ArrayNullPointerException("Your right array is null");

        int lengthOfResultArray = leftArray.length;
        T[] copy = Arrays.copyOf(leftArray, leftArray.length);

        int count = 0;

        Arrays.sort(copy);

        for (T element : rightArray) {
            int index = Arrays.binarySearch(copy, element);
            if(index < 0)
                count++;
        }

        lengthOfResultArray += count;


        T[] result = Arrays.copyOf(leftArray, lengthOfResultArray);

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
