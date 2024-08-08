package org.example.advancedArrayMethods;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


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

    @Override
    public int sumValueFromArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    @Override
    public int sumValueFromArrayMethodWithStream(int[] array) {
        return Arrays.stream(array).sum();
    }

    @Override
    public int sumValueFromArrayMethodWithStreamAndObject(Integer[] array) {
        return Arrays.stream(array)
                .mapToInt(Integer::intValue)
                .sum();
    }

    @Override
    public double averageValueFromArray(int[] array) {
        return (double) sumValueFromArray(array) / array.length;
    }

    @Override
    public String characterArrayToString(Character[] array) {
        Stream<Character> characterStream = Arrays.stream(array);
        return characterStream.map(String::valueOf).collect(Collectors.joining());
    }

    @Override
    public int[] charArrayToInt(char[] array) {
        int[] ints = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(array[i]));
        }
        return ints;
    }

    @Override
    public int targetInArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int targetInArrayWithList(Integer[] array, int target) {
        List<Integer> list = Arrays.asList(array);
        return list.indexOf(target);
    }

    @Override
    public int targetInArrayWithBinarySearch(int[] array, int target) {
        return Arrays.binarySearch(array, target);
    }

    @Override
    public int targetInArrayWithIntStream(int[] array, int target) {
        return IntStream.range(0, array.length)
                .filter(i->array[i] == target)
                .findFirst()
                .orElse(-1);
    }

    @Override
    public int targetInArrayWithArrayUtils(int[] array, int target) {
        return ArrayUtils.indexOf(array, target);
    }

    @Override
    public double medianArrayValues(int[] array) {
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0){
            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
        } else {
            median = (double) array[array.length/2];
        }
        return median;
    }

    @Override
    public int[] sumTwoArraysSameLength(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }
        return arr3;
    }

    @Override
    public int[] sumTwoArraysSameLengthWithStream(int[] arr1, int[] arr2) {
        IntStream range = IntStream.range(0, Math.min(arr1.length, arr2.length));
        IntStream stream3 = range.map(i -> arr1[i] + arr2[i]);
        return stream3.toArray();
    }


}



