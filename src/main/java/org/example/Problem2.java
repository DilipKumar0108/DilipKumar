package org.example;

import java.util.Scanner;

public class Problem2 {
    static Scanner s=new Scanner(System.in);
   public static void main(String[] args){
       System.out.println("Enter the value");
       int value=s.nextInt();
       for(int i=1;i<=value;i++){
           int a=(2*i)-1;
           System.out.print(a);
           if(i<value){
               System.out.print(", ");
           }
       }

   }

}
