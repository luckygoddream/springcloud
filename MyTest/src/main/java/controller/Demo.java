package controller;



import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
//        String s = String.valueOf("萧綦");
//        System.out.println(s);
//        String ss = "123456".substring(2);
//        System.out.println(ss);
//        Integer d = Integer.parseInt("1") + Integer.parseInt("2");
//        System.out.println(d);
//        try {
//            Date date = DateUtils.parseDate("2021-05-01 01:01:01", "yyyy-MM-dd HH:mm:ss");
//            System.out.println(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        Map<String,Integer> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);


        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).
                        collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                                (oldVal, newVal) -> oldVal, LinkedHashMap::new));


        sortedMap.entrySet().forEach(System.out::println);

        String string = UUID.randomUUID().toString();
        System.out.println(string);


    }
}
