package com.epam.first.fistdemo;

 import java.util.Arrays;
 import java.util.Scanner;

 public class FirstDemo {
    public static void main(String[] args) {
        System.out.println("Please enter space-separated int numbers:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] numbers = str.split("\\s+");
        System.out.println("1) Reorder numbers");
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.printf("2) Array without new line: " + Arrays.toString(numbers) + "\n");
        System.out.println();
        System.out.println("3) Array with new line: ");
        System.out.println(Arrays.toString(numbers).replace(',', '\n'));
        System.out.println();
        System.out.println("4) Even numbers");
        for (var ii : numbers ){
            if (Integer.parseInt(ii) % 2 == 0){
                System.out.printf(ii + " ");
            }
        }
        System.out.println();
        System.out.println("5) Uneven numbers");
        for (var ii : numbers ){
            if (Integer.parseInt(ii) % 2 == 1){
                System.out.printf(ii + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("6) Min and max value");
        int[] intArray = arrayStringToInt (numbers);
        int min = intArray[0];
        int max = intArray[0];
        for (int ii: intArray){
            if (ii < min){
                min = ii;
            } else if (ii > max) {
                max = ii;
            }
        }
        System.out.printf("Min value = %d \n", min);
        System.out.printf("Max value = %d \n", max);
        System.out.println();
        System.out.println("7) Devided on 3 or 9");
        for (int ii: intArray){
            if (ii % 3 == 0){
                System.out.printf(ii + " ");
            }
        }
        System.out.println();
        System.out.println("8) Devided on 5 and 7");
        for (int ii: intArray){
            if (ii % 5 == 0 && ii % 7 == 0){
                System.out.printf(ii + " ");
            }
        }

    }
    public static int[] arrayStringToInt ( String[] arr){
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }
        return intArr;
    }
}