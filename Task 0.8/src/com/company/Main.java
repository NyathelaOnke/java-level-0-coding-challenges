package com.company;

public class Main {

    static String numberToTime (int num){
        int hour = num / 60;
        int minutes = num % 60;
        String strMin = "minute";
        String strHour = "hour";
        if (hour > 1 || hour == 0) strHour += "s";
        if (minutes > 1 || minutes == 0) strMin += "s";
        return String.valueOf(hour) + " " + strHour + ", " + String.valueOf(minutes) + " " + strMin;

    }
    public static void main(String[] args) {
        System.out.println(numberToTime(120));
	// write your code here
    }
}
