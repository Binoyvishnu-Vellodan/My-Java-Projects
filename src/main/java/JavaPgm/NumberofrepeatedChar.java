package JavaPgm;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.example.Number_of_repeated_substring_ina__String.MostRepeatedString;

public class NumberofrepeatedChar {
    public static  void main(String args[]){
//        DisplayCountOfChar();
//        MostRepeatedString();
//        ReverseString();
//        ReverseStringMap();
    }

    private static void ReverseStringMap() {
        String Str="Binoy vishnu";
        int strlen=Str.length();
        char[] word=Str.toCharArray();
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char ch: word){
            map.put(ch, map.getOrDefault(ch,strlen)-1);
        }
        for(char ch: map.keySet()){
            System.out.println(map.get(ch));
        }
    }

    private static void ReverseString() {
        String Str="Binoy vishnu";
        int strlen= Str.length();
        String RevStr="";
        String RevSt= new StringBuilder(Str).reverse().toString();
        System.out.println("****"+RevSt+"****");
        char[] ch=Str.toCharArray();
        for(int i=strlen-1;i>=0;i--){
            RevStr+= Str.charAt(i);
        }
        System.out.println(RevStr);
    }

    private static void DisplayCountOfChar() {
        String Str="binoy vishnu vellodan";
        int count=0;
        char maxchar=' ';
        char[] chars= Str.toCharArray();
        HashMap<Character, Integer> map= new LinkedHashMap<>();
        for(char c: chars){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char c: map.keySet()){
            System.out.println(c+" is repeated "+map.get(c)+ "time");
            if(map.get(c)>count) {
                count= map.get(c);
                maxchar=c;
            }
        }
        System.out.println("Most repeated Char ="+ maxchar +" and its Count is= "+ count);
    }
    private static void MostRepeatedString() {
        String Str="India is my country I love India. India is a big country";
        String[] Words=Str.trim().split(" ");
        String maxword="";
        int count=0;
        HashMap<String, Integer> map= new LinkedHashMap<>();
        for(String word: Words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        for(String word: map.keySet()){
            if(map.get(word)>count) {
                count = map.get(word);
                maxword = word;
            }
        }
        System.out.println("The Most Repeated String= "+maxword);
    }

}
