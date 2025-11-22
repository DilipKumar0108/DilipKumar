package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Problem1 {
    static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        int value1=s.nextInt();
        int value2=s.nextInt();

        int input=s.nextInt();

        switch(input){

            case 1 : {System.out.println("Addition:"+ (value1+value2));
                         break;
            }
            case 2 : {System.out.println("Substraction:"+(value1 - value2));
                break;
            }
            case 3 : {System.out.println("Multiplication:"+ (value1*value2));
                break;
            }
            case 4 : {System.out.println("Division:"+ (value1/value2));
                break;
            }
        }


    }


}

