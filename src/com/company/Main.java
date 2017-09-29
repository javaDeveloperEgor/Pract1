package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void print(String[] args){
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }

    public static void sort(String[] args) {
        for (int j = args.length - 1; j >= 0; j--) {
            for (int k = 0; k < j; k++) {
                if (args[k].compareTo(args[k + 1]) > 0) {
                    String t = args[k];
                    args[k] = args[k + 1];
                    args[k + 1] = t;
                }
            }
        }
        print(args);
    }


    public static void main(String[] args) {
        String[] arrayString = new String[]{"Kyiv", "Warshawa", "Amsterdam"};
        print(arrayString);
        System.out.println();
        sort(arrayString);
    }

}
