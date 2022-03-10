package com.company;

public class Main {

    public static void commonLetters(String strOne, String strTwo){
        strOne = strOne.toLowerCase();
        strTwo = strTwo.toLowerCase();
        String outputStr = "";
        for (int i = 0; i < strOne.length(); i++){
            for (int f = 0; f < strTwo.length(); f++){
                if(strOne.charAt(i) == strTwo.charAt(f)){
                    outputStr += strOne.charAt(i) + ", ";
                    strTwo = strTwo.replace(Character.toString(strTwo.charAt(f)), "");
                    break;
                }
            }
        }
        System.out.println("Common letters: " + outputStr.substring(0, outputStr.length() - 2));
    }
    public static void main(String[] args) {
        commonLetters("Houpses", "cOmputers");
	// write your code here
    }
}
