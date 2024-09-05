package org.example;

import org.openqa.selenium.json.JsonOutput;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Number_of_repeated_substring_ina__String {

    //calling all the methods related to the string actions performed and show its result
    public static void main(String[] args) {
        String Str = "I like munnar and munnar is a beautiful place and munnar is a hilll station";
        Integer mostRepeatedWordCount= mostRepeatedWordCount(Str);
        String MostRepeatedWord= MostRepeatedWord(Str);
        String MostRepeatedString= MostRepeatedString(Str);
        System.out.println("The most repeated word count = "+ mostRepeatedWordCount);
        System.out.println("The most repeated word is = "+ MostRepeatedWord);
        System.out.println("The most repeated string is = "+ MostRepeatedString);
    }

        //method returns the most Repeated Word Count
        public static Integer mostRepeatedWordCount(String Str) {
        String[] words=Str.trim().split("\\s+");
        int Repeatedword=0;
        int wordcount= words.length;
        System.out.println(wordcount);
        for (int i = 0; i < wordcount;i++){
            if(words[i].contains("munnar")){
                Repeatedword=Repeatedword+1;
            }
        }
        return Repeatedword;
    }

    public static  String MostRepeatedWord(String Str) {
    String[] words=Str.trim().split("\\s");
    Map<String, Integer> wordcount= new HashMap<>();
    for(String word: words){
        wordcount.put(word,wordcount.getOrDefault(word,0)+1);
    }
    String mostrepeated= null;
    int maxcount=0;
    for(Map.Entry<String,Integer> entry: wordcount.entrySet()){
        if(entry.getValue()>maxcount){
            maxcount=entry.getValue();
            mostrepeated=entry.getKey();
        }
    }
    return mostrepeated;
    }
    public static  String MostRepeatedString(String Str) {
        Map<String, Integer> substringCount = new HashMap<>();
        for(int length=2;length<=Str.length();length++){
            for(int i=0;i<=Str.length()- length;i++){
                String substring= Str.substring(i,i+length);
                substringCount.put(substring,substringCount.getOrDefault(substring,0)+1);
            }
        }
        String mostrepeated = "";
        int maxcount = 0;
        for (Map.Entry<String, Integer> entry : substringCount.entrySet()) {
            if (entry.getValue() > maxcount ) {
                mostrepeated = entry.getKey();
                maxcount = entry.getValue();
            }
        }
        return mostrepeated;
    }
}
