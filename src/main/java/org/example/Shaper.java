package org.example;

public class Shaper {
    public static  void  main(String args[]){
        Abstractor rectangle= new Rectangle(5,3);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
