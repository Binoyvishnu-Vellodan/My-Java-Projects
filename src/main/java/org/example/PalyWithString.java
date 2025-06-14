package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PalyWithString {
    static String Str="This is our world and Our world is Beautiful";
    public static void main(String args[]){

        maxString();
    }

    private static void maxString () {
        String[] words=Str.trim().split(" ");
        System.out.println(words);
        HashMap<String, Integer> map= new LinkedHashMap<>();

        for(String word: words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word: map.keySet()){
            System.out.println(word+"="+map.get(word));
        }

    }
}
