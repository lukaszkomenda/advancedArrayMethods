package org.example.advancedArrayMethods;

public interface AdvancedArrayMethods {

    int firstItem (int[] array);
    int lastItem (int[] array);
    int anyValue (int[] array);
    int[] extendedArray (int[] array);
    int[] insertValueIntoArray(int[] array);
    boolean comparisonArrays (int[] array1, int[] array2);
    boolean isArrayEmpty(int[] array);
    boolean isArrayEmptyMethod2(int[] array);
    int[] shuffleArray(int[] array);
    int minValue(int[] array);
    int maxValue(int[] array);
    int sumValueFromArray(int[] array);
    int sumValueFromArrayMethodWithStream(int[] array);
    int sumValueFromArrayMethodWithStreamAndObject(Integer[] array);
    double averageValueFromArray(int[] array);
    String characterArrayToString(Character[] array);
    int[] charArrayToInt (char[] array);
    int targetInArray(int[] array, int target);
    int targetInArrayWithList(Integer[] array, int target);
    int targetInArrayWithBinarySearch(int[] array, int target);
    int targetInArrayWithIntStream(int[] array, int target);
    int targetInArrayWithArrayUtils(int[] array, int target);
    double medianArrayValues(int[] array);
    int[] sumTwoArraysSameLength(int[] arr1, int[] arr2);
    int[] sumTwoArraysSameLengthWithStream(int[] arr1, int[] arr2);
}
