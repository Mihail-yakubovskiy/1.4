package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Print random number");
        int k = in.nextInt();
        for (int i = 0; i<k; i++){
            System.out.println(i+1);
        }

    }
}
