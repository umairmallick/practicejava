package part9;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class minValueMap {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lMap=new LinkedHashMap<>();
        lMap.put("Fun",56);
        lMap.put("Java",6);
        lMap.put("is",46);

        minMap(lMap);
    }

    public static void minMap(Map<String,Integer> map){
//        Map<String,Integer> trMap= new HashMap<>();
//        TreeSet<Integer> tSet=new TreeSet<>(map.values());
//        System.out.println("tSet.first() = " + tSet.first());
//        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
//        list.sort(Map.Entry.comparingByValue());
//        System.out.println("DESCENDING");
//        Map<String,Integer> desc= new LinkedHashMap<>();
//        for (int i = list.size()-1; i >=0 ; i--) {
//            desc.put(list.get(i).getKey(),list.get(i).getValue());
//        }
//        System.out.println("desc = " + desc);
//        System.out.println("ASCENDING");
//        for (Map.Entry<String, Integer> integerEntry : list) {
//            trMap.put(integerEntry.getKey(),integerEntry.getValue());
//        }
//        System.out.println("trMap = " + trMap);
        List<Map.Entry<String,Integer>> lMap = new ArrayList<>(map.entrySet());
        lMap.sort(Map.Entry.comparingByValue());
        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> each : lMap) {
            linkedMap.put(each.getKey(),each.getValue());
        }
        System.out.println("linkedMap = " + linkedMap);


    }


}
