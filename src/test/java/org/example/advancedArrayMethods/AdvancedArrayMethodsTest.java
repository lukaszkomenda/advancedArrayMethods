package org.example.advancedArrayMethods;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedArrayMethodsTest {

    AdvancedArrayMethods advancedArrayMethods = new AdvancedArrayMethodsImpl();

    @Test
    void getFirstItemTest() {
        //given
        int[] array = {0, 1, 2, 4};
        //when
        int firstItem = advancedArrayMethods.firstItem(array);
        //then
        assertEquals(0, firstItem);
    }

    @Test
    void emptyArrayTest() {
        //given
        int[] array = new int[0];
        //when
        int firstItem = advancedArrayMethods.firstItem(array);
        //then
        assertEquals(0, firstItem);
    }

    @Test
    void getLatItemTest() {
        //given
        int[] array = {3, 4, 5, 6};
        //when
        int lastItem = advancedArrayMethods.lastItem(array);
        //then
        assertEquals(6, lastItem);
    }

    @Test
    void emptyArrayLastItemTest() {
        //given
        int[] array = new int[0];
        //when
        int lastItem = advancedArrayMethods.lastItem(array);
        //then
        assertEquals(0, lastItem);
    }

    @Test
    void randomValueFromArrayTest() {
        //given
        int[] array = {3, 4, 5, 6, 8, 12};
        //when
        int anyValue = advancedArrayMethods.anyValue(array);
        //when
        assertEquals(3, anyValue);
    }

    @Test
    void extendedArrayTest() {
        //given
        int[] array = {1, 2, 3, 5};
        //when
        int[] newArray = advancedArrayMethods.extendedArray(array);
        //then
        assertEquals(array.length + 1, newArray.length);
    }

    @Test
    void insertValueIntoArrayTest() {
        //given
        int[] array = {1, 2, 3, 4, 5};
        //when
        int[] newArray = advancedArrayMethods.insertValueIntoArray(array);
        //then
        assertEquals(array.length + 1, newArray.length);
    }

    @Test
    void getLastValueTest() {
        //given
        int[] array = {1, 2, 3, 4, 5};
        //when
        int[] newArray = advancedArrayMethods.insertValueIntoArray(array);
        //then
        assertEquals(77, newArray[2]);
    }

    @Test
    void isArraysSame() {
        //given
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 0, 4, 5};
        //when
        boolean isArraysEqual = advancedArrayMethods.comparisonArrays(array1, array2);
        //then
        assertFalse(isArraysEqual);
    }

    @Test
    void isEmptyArray() {
        //given
        int[] array = null;
        //when
        boolean isEmpty = advancedArrayMethods.isArrayEmpty(array);
        boolean isEmptyMethod2 = advancedArrayMethods.isArrayEmptyMethod2(array);
        //then
        assertTrue(isEmpty);
        assertTrue(isEmptyMethod2);
    }

    @Test
    void isArrayShuffledTest() {
        //given
        int[] array = {1, 2, 3, 5, 9, 15};
        //when
        int[] newArray = advancedArrayMethods.shuffleArray(array);
        //then
        assertEquals(1, newArray[0]);
    }

    @Test
    void minValueTest() {
        //given
        int[] array = {1, 3, 5, -1, 7, 8};
        //when
        int minValue = advancedArrayMethods.minValue(array);
        //then
        assertEquals(-1, minValue);
    }

    @Test
    void maxValueTest() {
        //given
        int[] array = {1, 3, 5, -1, 7, 8};
        //when
        int maxValue = advancedArrayMethods.maxValue(array);
        //then
        assertEquals(8, maxValue);
    }

    @Test
    void sumValueFromArrayTest() {
        //given
        int[] array = {1, 4, 6, 9, 12, -1};
        //when
        int sum = advancedArrayMethods.sumValueFromArray(array);
        int sum2 = advancedArrayMethods.sumValueFromArrayMethodWithStream(array);
        //then
        assertEquals(31, sum);
        assertEquals(31, sum2);
    }

    @Test
    void sumValueFromIntegerArrayTest() {
        //given
        Integer[] array = {1, 4, 6, 9, 12, -1};
        //when
        int sum = advancedArrayMethods.sumValueFromArrayMethodWithStreamAndObject(array);
        //then
        assertEquals(31, sum);
    }

    @Test
    void averageValueFromArrayTest() {
        //given
        int[] array = {1, 5, 9, 3, -15, 54};
        //when
        double average = advancedArrayMethods.averageValueFromArray(array);
        //then
        assertEquals(9.5, average);
    }

    @Test
    void characterArrayToStringTest() {
        //given
        Character[] charArray = {'b', 'a', 'e', 'l', 'd', 'u', 'n', 'g'};
        //when
        String str = advancedArrayMethods.characterArrayToString(charArray);
        //then
        assertEquals("baeldung", str);
    }

    @Test
    void charArrayToIntTest() {
        //given
        char[] array = {'9', '8', '7', '6'};
        //when
        int[] ints = advancedArrayMethods.charArrayToInt(array);
        //then
        int[] expected = {9, 8, 7, 6};
        assertArrayEquals(expected, ints);
    }

    @Test
    void targetInArrayTest() {
        //given
        int[] array = {1, 4, 6, 8, 9, 10};
        int target = 6;
        Integer[] arrayInt = Arrays.stream(array)
                .boxed()
                .toArray(Integer[]::new);
        //when
        int index = advancedArrayMethods.targetInArray(array, target);
        int index2 = advancedArrayMethods.targetInArrayWithList(arrayInt, target);
        int index3 = advancedArrayMethods.targetInArrayWithBinarySearch(array, target);
        int index4 = advancedArrayMethods.targetInArrayWithIntStream(array, target);
        int index5 = advancedArrayMethods.targetInArrayWithArrayUtils(array, target);
        //then
        assertEquals(2, index);
        assertEquals(2, index2);
        assertEquals(2, index3);
        assertEquals(2, index4);
        assertEquals(2, index5);
    }
    @Test
    void medianArrayValuesEvenLengthTest(){
        //given
        int[] array = {1,3,6,7,15,25,43,-16};
        //when
        double median = advancedArrayMethods.medianArrayValues(array);
        //then
        assertEquals(6.5, median);
    }
    @Test
    void medianArrayValuesOddLengthTest() {
        //given
        int[] array = {1,3,6,7,15,25,43};
        //when
        double median = advancedArrayMethods.medianArrayValues(array);
        //then
        assertEquals(7, median);
    }

    @Test
    void sumTwoArraysSameLengthTest(){
        //given
        int[] arr1 = {1,4,6,9,8,14,15};
        int[] arr2 = {3,7,10,-1,-5,4,0};
        //when
        int[] arr3 = advancedArrayMethods.sumTwoArraysSameLength(arr1, arr2);
        int[] arr4 = advancedArrayMethods.sumTwoArraysSameLengthWithStream(arr1, arr2);
        //then
        int[] expectedArr = {4, 11, 16, 8, 3, 18, 15};
        assertArrayEquals(expectedArr, arr3);
        assertArrayEquals(expectedArr, arr4);
    }
}