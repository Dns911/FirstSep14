package com.epam.practise.algoritmtask.third;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrService {
    public ArrService() {
    }
    public int[] HandlerArr (int[] a){
        int s = a.length;
        int[] b = new int[s * (s - 1) / 2];
        int count = 0;
        while (s > 0){
            for (int i = 0; i + s < a.length; i++){
                b[count] = SumCustom(a, i, i + s );
                count++;
            }
            s--;
        }
        Arrays.sort(b);
        return b;
    }
    private int SumCustom(int[] a, int indexLeft, int indexRight){
        int sum = 0;
        for (int i = indexLeft; i <= indexRight; i++){
            sum += a[i];
        }
        return sum;
    }
}
