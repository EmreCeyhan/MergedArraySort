package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeArraysTest {

    @Test
    @DisplayName("Merging two sorted arrays")
    void mergeTwoSortedArraysTest() {
        int[] sortedArray1 = {1,3,5,7,9};
        int[] sortedArray2 = {2,4,6,8,10};

        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        int[] result = MergeArrays.merge(sortedArray1,sortedArray2);
        assertArrayEquals(expected, result);
    }
}