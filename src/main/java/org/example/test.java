package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class test {
    public static void main(String args[]) {
        String str = "BinoyvishnuBB";
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        int strlen = str.length();
        int count = 0;
        for (int i = 0; i < strlen; i++) {
            Character c = str.charAt(i);
            if (map.containsKey(c)) {
                // If it exists, increment the count
                map.put(c, map.get(c) + 1);
            } else {
                // If it doesn't exist, add it to the map with count 1
                map.put(c, 1);
            }
        }

        // Print the character counts
        for (char c : map.keySet()) {
            System.out.println(c + " = " + map.get(c));
        }
    }
}


//    int[] count=new int[144];
//        String str = "Binoyvishnu";
//        int strlen= str.length();
//        for(int i=0;i<strlen;i++){
//            count[str.charAt(i)]++;
//        }
//        for (int i=0;i<144;i++){
//            if(count[i]>0){
//                System.out.println((char)i+ "="+count[i]);
//            }
//        }
//    }
//
//}
