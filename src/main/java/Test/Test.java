package Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String args[]){
        String s="Geethika";
        int count=0;
        Character most= null;
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> value:map.entrySet()){
            System.out.println(value.getKey()+"="+value.getValue());
            if(value.getValue()>count){
                count=value.getValue();
                most=value.getKey();
            }
        }
        System.out.println("The most repeated String is ="+most);
    }

}
