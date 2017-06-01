package com.azarov.simple.app;

import com.azarov.simple.sort.BubleSort;
import com.azarov.simple.sort.QuickSort;
import com.azarov.simple.sort.ShakerSort;
import com.azarov.simple.sort.SortUtils;

/**
 * Copyright DonRiver Inc. All Rights Reserved.
 *
 * @Author: Dmitry Azarov
 * @Created: 2017-04-27
 */
public class SortMain {

    public static void main(String[] args) {
        // 1:
        //create array
        int[] array = SortUtils.createArray(30);
        //print contents of the array before sort
        SortUtils.printArray(array);
        //use quick sort
        QuickSort quickSortInstance = new QuickSort(array);
        quickSortInstance.sort();
        //print contents of the array after sort
        SortUtils.printArray(array);

        //2:
        //create array
        int[] array2 = SortUtils.createArray(6);
        //print contents of the array before sort
        SortUtils.printArray(array2);
        //use quick sort
        BubleSort bubleSortAsc = new BubleSort(array2);
        bubleSortAsc.sortAsc();
        //print contents of the array after sort
        SortUtils.printArray(array2);

        //3:
        // Get array from other example and make a desc sort
        //print contents of the array before sort
        SortUtils.printArray(array2);
        //use quick sort
        BubleSort bubleSortDesc = new BubleSort(array2);
        bubleSortDesc.sortDesc();
        //print contents of the array after sort
        SortUtils.printArray(array2);

        //4:
        //create array
        int[] array4 = SortUtils.createArray(30);
        //print contents of the array before sort
        SortUtils.printArray(array4);
        //use quick sort
        ShakerSort shaikerSort = new ShakerSort(array4);
        shaikerSort.sort();
        //print contents of the array after sort
        SortUtils.printArray(array4);
    }
}
