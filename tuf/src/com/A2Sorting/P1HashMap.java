package com.A2Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P1HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("China",180);
        map.put("India",90);
        map.put("England",80);

        System.out.println(map);

        if(map.containsKey("China")){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }

//        System.out.println(map.get("China"));
//        System.out.println(map.get("Iran"));
//
//        for(Map.Entry<String,Integer> e:map.entrySet()){
////            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
    }
}
