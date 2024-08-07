package org.example.advancedArrayMethods;

import org.junit.jupiter.api.Test;

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
    void isArrayShuffledTest(){
        //given
        int[] array = {1,2,3,5,9,15};
        //when
        int[] newArray = advancedArrayMethods.shuffleArray(array);
        //then
        assertEquals(1, newArray[0]);
    }

    @Test
    void minValueTest(){
        //given
        int[] array = {1,3,5,-1,7,8};
        //when
        int minValue = advancedArrayMethods.minValue(array);
        //then
        assertEquals(-1, minValue);
    }
    @Test
    void maxValueTest(){
        //given
        int[] array = {1,3,5,-1,7,8};
        //when
        int maxValue = advancedArrayMethods.maxValue(array);
        //then
        assertEquals(8, maxValue);
    }

}