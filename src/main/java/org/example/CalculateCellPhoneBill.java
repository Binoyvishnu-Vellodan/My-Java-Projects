package org.example;
import java.util.Scanner;

public class CalculateCellPhoneBill {
    static Scanner scanner= new Scanner(System.in);
    private static double subTotal=0;


    public static void main(String args[]){
    double tax=calculateTax();
    double fee=overageFee();
    double itemizedBill= finalTotal(tax,fee);
        System.out.println("The total itemized bill = "+itemizedBill);
    }
    public static double calculateTax(){
        System.out.println("Enter the Plan Fee: ");
        subTotal=scanner.nextDouble();
        double tax=(subTotal*15)/100;
        return tax;
    }
    public static double overageFee(){
        System.out.println("Enter the number of overage minutes: ");
        int minutes=scanner.nextInt();
        double overageFee=minutes*0.25;
        return overageFee;
    }
    public static double finalTotal(double tax,double overageFee){
        Double FinalTotal= subTotal+tax+overageFee;
        return FinalTotal;
    }
    public double Subtotal(){
        return subTotal;
    }
}
