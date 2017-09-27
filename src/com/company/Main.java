package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void print(String[] args){
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }

    public static void sort(String[] args){
        Arrays.sort(args, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        });

        System.out.println(Arrays.toString(args));
    }

    public static void main(String[] args) {
        String[] arrayString = new String[]{"Kyiv", "Warshawa", "Amsterdam"};
        print(arrayString);
        System.out.println();
        sort(arrayString);
    }

}
