package org.example;

import java.awt.*;
import java.util.Scanner;

public class PhoneBill {
    private static int ID = 0;
    static Scanner scanner= new Scanner(System.in);
    public static void main(String args[]){
        PhoneBill Bill1=new PhoneBill(12);
        PhoneBill Bill2=new PhoneBill();

    }
    public PhoneBill(int ID){
        System.out.println("Enter the phone bill ID: ");
        int Id=scanner.nextInt();
        this.ID=Id;
    }
    public PhoneBill(){
        CalculateCellPhoneBill bill=new CalculateCellPhoneBill();
        double PlanFee=bill.Subtotal();
        double tax=bill.calculateTax();
        double fee=bill.overageFee();
        double itemizedBill= bill.finalTotal(tax,fee);
        System.out.println("The Phone Bill ID ="+ID);
        System.out.println("The Plan Fee = "+PlanFee);
        System.out.println("The tax = "+tax);
        System.out.println("The total overageFee = "+fee);
        System.out.println("The total itemized bill = "+itemizedBill);
    }
}
