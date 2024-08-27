package org.example;

import org.openqa.selenium.json.JsonOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Number_of_repeated_substring_ina__String {

    public static void d(String args[]) {
        String Str = "I like munnar and munnar is a beautiful place and munnar is a hilll station";
        String[] words=Str.trim().split("\\s+");
        int Repeatedword=0;
        int wordcount= words.length;
        System.out.println(wordcount);
        for (int i = 0; i < wordcount;i++){
            if(words[i].contains("munnar")){
                Repeatedword=Repeatedword+1;
            }
        }
        System.out.println("Repeated word count = "+ Repeatedword );
    }
    public static  void main(String args[]){
        String Str= "I like munnar and munnar is a beautiful place and munnar is a hilll station";
        String[] words=Str.split(" ");
        Map<String, String> datamap= new HashMap<>();
        String mostrepeatedString=null;

//        String[] wordcout=Str.trim().split("\\s+");
//        for(int i=0;i<wordcout;i++){
//            arr = arr.add(i);

//        }

    }
}
