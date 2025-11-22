package org.example;

import java.util.Scanner;

public class Problem3 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the value");
        int value=s.nextInt();
        if(value%2==1){
            for(int i=1;i<=value;i++){
                int odd=(2*i)-1;
                System.out.print(odd);

                if(i<value){
                    System.out.print(", ");
                }
            }
        }else{
            for (int i=1;i<value;i++){
                int even=(2*i)-1;
                System.out.print(even);
                if(i< value-1){
                    System.out.print(", ");
                }
            }
        }
    }
}
