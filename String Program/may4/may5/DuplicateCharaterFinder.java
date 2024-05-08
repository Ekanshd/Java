package com.may5;

public class DuplicateCharaterFinder {
    public static void findDuplicatesUsingTwoLoops(String input) {
    	
        char[] characters = input.toCharArray();
        int length = characters.length;

        System.out.print("Duplicate Characters using Two Loops: ");
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    System.out.print(characters[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String input = "The rain in the spain";
        findDuplicatesUsingTwoLoops(input);
    }
}
