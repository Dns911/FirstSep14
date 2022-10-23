package com.epam.practise.algoritmtask.third;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrService {
    public ArrService(){}

    public int[] HandlerArr(int[] source) {
        int resLength = source.length * (source.length - 1) / 2;
        int[] resultArr = new int[resLength];
        int count = 0;
        for (int i = 0; i < source.length; i++) {
            int sum = source[i];
            for (int j = i + 1; j < source.length; j++) {
                sum += source[j];
                resultArr[count] = sum;
                count++;
            }
        }
        Arrays.sort(resultArr);
        return resultArr;
    }
}
