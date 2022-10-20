package com.epam.practise.algoritmtask.third;

import com.epam.practise.algoritmtask.reader.ArrParser;
import com.epam.practise.algoritmtask.reader.ArrayFileReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class ThirdMain {
    static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.log(Level.INFO, "START");
        ArrayFileReader arrayFileReader = new ArrayFileReader();
        List<String> stringList = arrayFileReader.readFromFile("data\\3.txt");
        int[] a = ArrParser.parseStringToArray(stringList.get(0));
        int[] sourceArr = ArrParser.parseStringToArray(stringList.get(1));
        int n = a[0];
        int k = a[1];
        logger.log(Level.INFO, Arrays.toString(sourceArr));
        ArrService arrService = new ArrService();
        int[] result = arrService.HandlerArr(sourceArr);
        logger.log(Level.INFO, Arrays.toString(result));
        int res = result[result.length - k];
        logger.log(Level.INFO, res);
    }
}
