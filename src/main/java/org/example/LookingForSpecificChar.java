package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LookingForSpecificChar {
    public  static  void main(String args[]){
    Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String Str=scanner.next();
        scanner.close();
        boolean letterfound=false;
        int length=Str.length();
        for(int i=0;i<length;i++){
            if(Str.charAt(i)=='A'||Str.charAt(i+1)=='a'){
                letterfound=true;
                System.out.println("The character is at the position of "+i);
                break;
            }
        }
    }
}
