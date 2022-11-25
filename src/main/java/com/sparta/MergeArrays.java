package com.sparta;

public class MergeArrays {
    public static int[] merge(int[] firstArray, int[] secondArray){

        int firstLength = firstArray.length;
        int secondLength = secondArray.length;
        int length = firstArray.length + secondArray.length;
        int[] merged = new int[length];
        int firstCounter = 0;
        int secondCounter = 0;
        int mergedCounter = 0;

        while(firstCounter < firstLength && secondCounter < secondLength) {
            if (firstArray[firstCounter] < secondArray[secondCounter]) {
                merged[mergedCounter++] = firstArray[firstCounter++];
            } else {
                merged[mergedCounter++] = secondArray[secondCounter++];
            }
        }
        while (firstCounter < firstLength) {
            merged[mergedCounter++] = firstArray[firstCounter++];
        }

        while (secondCounter < secondLength) {
            merged[mergedCounter++] = secondArray[secondCounter++];
        }


        return merged;




    }

}
