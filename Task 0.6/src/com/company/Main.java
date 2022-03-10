package com.company;

public class Main {

    static int maximum(int... nums){
        int maximumNum = 0;
        for(int i : nums){
            if(i > maximumNum) maximumNum = i;
        }
        return maximumNum;
    }
    public static void main(String[] args) {
        System.out.println(maximum(15, 20, 2, 25, 7, 8, 55));
	// write your code here
    }
}
