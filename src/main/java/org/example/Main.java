package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the value 1");
        int value=s.nextInt();
        System.out.println("Enter the value 2");
        int value2=s.nextInt();
        System.out.println("Enter 1 for add \n Enter 2 for sub \n Enter 3 for mul \n Enter 4 for div");
        int operator=s.nextInt();
        Problem1 problem=new Problem1();
        int result=problem.twoSum(value,value2,operator);
        System.out.println("result: "+result);

    }


}

