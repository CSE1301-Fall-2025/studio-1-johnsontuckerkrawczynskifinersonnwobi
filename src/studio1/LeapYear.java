package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year.");
        int year = in.nextInt();
        boolean div400 = (year%400 == 0);
        boolean div4 = (year%4 == 0);
        boolean div100 = (year%100 !=0);
        boolean isLeapYear = (div400 || div4 && div100);
        System.out.println(isLeapYear);
    }
}
