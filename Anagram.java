package com.exercise;

import java.util.Scanner;

public class Anagram {

    private static boolean compare(String anagram1, String anagram2){
        char[] arr1 = anagram1.toLowerCase().toCharArray(), arr2 = anagram2.toLowerCase().toCharArray();
        if (arr1.length != arr2.length)
            return false;
        int[] counts = new int[26]; // The array will hold the number of occurrences for each char
        for (int i = 0; i < arr1.length; i++){
            counts[arr1[i]-97]++;
            counts[arr2[i]-97]--;
        }
        // The counts array will be full of zeros as long as the strings are anagrams
        for (int i = 0; i<26; i++)
            if (counts[i] != 0)
                return false;
        return true;
    }

    public static void main(String[] args)
    {
        Scanner user_input = new Scanner( System.in );

        String anagram1;
        System.out.print("Enter your first word: ");
        anagram1 = user_input.next();

        String anagram2;
        System.out.print("Enter your second word: ");
        anagram2 = user_input.next();

        System.out.println("String 1 : " + anagram1);
        System.out.println("String 2 : " + anagram2);
        System.out.println("Are the requested inputs anagrams?: " + compare(anagram1, anagram2));
        }
    }
