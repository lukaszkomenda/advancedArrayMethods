package org.example.advancedArrayMethods;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;



public class AdvancedArrayMethodsImpl implements AdvancedArrayMethods {
    @Override
    public int firstItem(int[] array) {

        if (array.length == 0) {
            System.out.println("an array need to be filled");
            return 0;
        }

        return array[0];
    }

    @Override
    public int lastItem(int[] array) {
        if (array.length == 0) {
            System.out.println("an array need to be filled");
            return 0;
        }

        return array[array.length - 1];
    }

    @Override
    public int anyValue(int[] array) {
        if (array.length == 0) {
            System.out.println("an array need to be filled");
            return 0;
        }

        return array[new Random().nextInt(array.length)];
    }

    @Override
    public int[] extendedArray(int[] array) {

        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = new Random().nextInt();

        return newArray;
    }

    @Override
    public int[] insertValueIntoArray(int[] array) {
        return ArrayUtils.insert(2, array, 77);
    }

    @Override
    public boolean comparisonArrays(int[] array1, int[] array2) {
        return array1 == array2;
    }

    @Override
    public boolean isArrayEmpty(int[] array) {
        return array == null;
    }

    @Override
    public boolean isArrayEmptyMethod2(int[] array) {
        return ArrayUtils.isEmpty(array);
    }

    @Override
    public int[] shuffleArray(int[] array) {
        ArrayUtils.shuffle(array);
        return array;

    }

    @Override
    public int minValue(int[] array) {
        return Arrays.stream(array)
                .min()
                .getAsInt();
    }

    @Override
    public int maxValue(int[] array) {
        return Arrays.stream(array)
                .max()
                .getAsInt();
    }


}
