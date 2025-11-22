package org.example;

import java.util.Scanner;

public class Problem1 {

    static Scanner s=new Scanner(System.in);
    public int twoSum(int a,int b,int input) {




      switch (input) {

            case 1: {
               return a+b;

            }
            case 2: {
               return a-b;

            }
            case 3: {
                return a*b;

            }
            case 4: {
                if(b==0){
                    System.out.println("Invalid number");
                    return 0;
                }
                return a/b;

            }
          default: System.out.println("Inavalid number");
          return 0;
        }

    }

}
