package com.azarov.simple.sort;

/**
 * Copyright DonRiver Inc. All Rights Reserved.
 *
 * @Author: Dmitry Azarov
 * @Created: 2017-04-28
 */
public class ShakerSort {

    private int arrayLength;
    private int index;
    private int[] array;

    public ShakerSort(int[] array) {
        this.array = array;
        this.arrayLength = array.length;
        this.index = arrayLength - 1;
    }

    public void sort(){
        boolean swp;
        for (int i = 0; i < index; i++) {
            swp = false;
            for(int j = 0; j < index - i; j++ ){
                if(array[j] > array[j+1]){
                    array[j] ^= array[j+1];
                    array[j+1] ^= array[j];
                    array[j] ^= array[j+1];
                    swp = true;
                }
            }

            for(int j = index-1-i; j > i; j-- ){
                if(array[j] < array[j-1]){
                    array[j] ^= array[j-1];
                    array[j-1] ^= array[j];
                    array[j] ^= array[j-1];
                    swp = true;
                }
            }
        }
    }
}
