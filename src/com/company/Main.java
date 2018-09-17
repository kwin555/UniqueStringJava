package com.company;

public class Main {

    public static void main(String[] args) {
        //testing
        System.out.println("Cac unique?: " + Main.isUniqueChars("Cac"));
    }

    static boolean isUniqueChars(String str) {
        //assuming ASCII character set
        //only 128 chars in ASCII set
        if(str.length() > 128) return false;
        boolean[] charSet = new boolean[128];
        for(int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(charSet[val]) { //already found this char in string
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }

}
