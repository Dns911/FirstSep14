package com.epam.practise.algoritmtask.second;

import com.epam.practise.algoritmtask.reader.ArrParser;
import com.epam.practise.algoritmtask.reader.ArrayFileReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class SecondMain {
    static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.log(Level.INFO, "START");
        ArrayFileReader arrayFileReader = new ArrayFileReader();
        List<String> stringList = arrayFileReader.readFromFile("data\\1.txt");
        int[] a = ArrParser.parseStringToArray(stringList.get(0));
        int[] sourceArr = ArrParser.parseStringToArray(stringList.get(1));
        int n = a[0];
        logger.log(Level.INFO, Arrays.toString(sourceArr));
        int count = 0;
        for (int i= 0; i < sourceArr.length; i++){
            for (int j = i + 1; j < sourceArr.length; j++){
                if (sourceArr[i] != sourceArr[j]){
                    count++;
                }
            }
        }
        logger.log(Level.INFO, count);
    }
}
