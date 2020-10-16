package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int stairsCount = scanner.nextInt();
        System.out.println("The number of variants of goint on stairs: " + countVariants(stairsCount));
    }
    public static int countVariants(int stairsCount){
        if(stairsCount==0){
            return 0;
        } else if(stairsCount==1){
            return 1;
        } else if(stairsCount==2){
            return 2;
        }
        return countVariants(stairsCount-1)+countVariants(stairsCount-2);
    }

}
