package com.azarov.simple.sort;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Copyright DonRiver Inc. All Rights Reserved.
 *
 * @Author: Dmitry Azarov
 * @Created: 2017-04-27
 */
public class BubleSort {

    private int arrayLength;
    private int[] array;

    public BubleSort(int[] array){
        this.array = array;
        this.arrayLength = array.length;

    }

    public void sortAsc() {
        int temp;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 1; j < arrayLength - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            //System.out.println("Iteration " + (i + 1) + ": " + Arrays.toString(array));
        }
    }

    public int[] sortDesc() {
        int temp;
        for (int i = 0; i < arrayLength - 1; i++) {

            for (int j = 1; j < arrayLength - i; j++) {
                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            //System.out.println("Iteration " + (i + 1) + ": " + Arrays.toString(array));
        }
        return array;
    }
}
