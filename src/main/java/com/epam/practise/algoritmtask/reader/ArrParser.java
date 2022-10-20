package com.epam.practise.algoritmtask.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrParser {
    static final Logger logger = LogManager.getLogger();
    public static final String ITEM_DELIMITER = ",?;?-?\\s+";
    public static final String NAME_ARRAY_DELIMITER = ":\\s?+";

    private ArrParser() {
        super();
    }

    public static int[] parseStringToArray(String str) {

        String[] strNumbers = str.split(ArrParser.ITEM_DELIMITER);
        int countItem = 0;
        for (String strNumber : strNumbers) {
                countItem++;
        }
        int[] arr = new int[countItem];
        int j = 0;
        for (int i = 0; i < strNumbers.length && j < countItem; i++) {
                arr[j] = Integer.parseInt(strNumbers[i]);
                j++;
        }

        return arr;
    }
}