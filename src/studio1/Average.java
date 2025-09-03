package studio1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the first integer?");
        int i1 = in.nextInt();
        System.out.println("What is the second integer?");
        int i2 = in.nextInt();
        double avg = (i1+i2)/2.0;
        System.out.println("The average is: " + avg);
    }
}
