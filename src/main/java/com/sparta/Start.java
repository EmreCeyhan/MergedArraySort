package com.sparta;

import java.util.Arrays;

public class Start {

    public void start()
    {
        MergeArrays m = new MergeArrays();
        int[] first = {1,5,6,7,8,11,12,13,14};
        int[] second = {2,3,4,9,10,15};
        int [] result = m.merge(first,second);
        System.out.println(Arrays.toString(result));
    }

}
