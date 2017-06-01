package com.azarov.simple.sort;

import java.util.Random;

/**
 * Copyright DonRiver Inc. All Rights Reserved.
 *
 * @Author: Dmitry Azarov
 * @Created: 2017-04-27
 */
public class SortUtils {

    public static int[] array;
    private static Random generator = new Random();

    public static int[] createArray(final int length) {
        array = new int[length];
        for (int i=0; i<length; i++) {
            array[i] = generator.nextInt(100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        int length = array.length;
        for (int i = 0; i< length -1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[length-1]);
    }

}
