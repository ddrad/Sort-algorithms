package com.azarov.simple.sort;

import java.util.Random;

/**
 * Copyright DonRiver Inc. All Rights Reserved.
 *
 * @Author: Dmitry Azarov
 * @Created: 2017-04-27
 */
public class QuickSort {

    private int arrayLength;
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
        this.arrayLength = array.length;
    }

    public void sort() {
        int startIndex = 0;
        int endIndex = arrayLength - 1;
        doSort(startIndex, endIndex);
    }

    private void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur + 1, end);
    }
}
