package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter the size of the array");
        int size=s.nextInt();
        System.out.println("Enter the value for the Elements ");
        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("arr["+i+"] : ");
          arr[i]=s.nextInt();
          System.out.println();
        }

        Map<Integer,Integer> result=new LinkedHashMap<>();
        for(int i=1;i<=9;i++){
            int count=0;
            for(int num:arr){
                if(num%i==0){
                    count++;
                }
            }
            result.put(i,count);
        }
        System.out.print("{");
        int index=0;
        for(Map.Entry<Integer,Integer> entry: result.entrySet()){
            System.out.print(entry.getKey()+":"+ entry.getValue());
            if(index<result.size()-1){
               System.out.print(",");
            }
            index++;
        }
        System.out.print("}");
    }
}
