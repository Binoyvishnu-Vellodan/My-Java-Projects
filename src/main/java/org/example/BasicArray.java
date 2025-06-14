package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class BasicArray {
    private static final int TOTAL=10;
    public static void main(String args[]) {
    Map<String,Integer> Out= Mapper();
        String[] str=getString();
        for (int i=0;i<TOTAL;i++) {
            for(int j=0;j<TOTAL;j++) {
                System.out.println(str[i]+"=="+Out.get(j));
            }
        }
    }
    public static String[] getString(){
        String Sr = "one two three four five six seven eight nine ten";
        String[] Str = new String[10];
        Str = Sr.split(" ");
        return Str;
    }
    public static int[][] generateNumbers() {
            int[][] ticket = new int[TOTAL][TOTAL];
            Random random = new Random();
            for (int i = 0; i < TOTAL; i++) {
                int base= i*10+1;
                for (int j=0;j<TOTAL;j++) {
                    ticket[i][j] = base+random.nextInt(9);
                }
            }
            return ticket;
        }
    public  static Map<String,Integer> Mapper(){
        Map<String, Integer> AllMap= new HashMap<>();
        String[] Str= getString();
        int[][] ticket= generateNumbers();
        for(int i = 0; i < TOTAL; i++){
            for(int j = 0; j < TOTAL; j++) {
                AllMap.put(Str[i], ticket[i][j]);
                System.out.println(Str[i]+" ==== "+ticket[i][j]);
            }
        }
        return AllMap;
    }

}
