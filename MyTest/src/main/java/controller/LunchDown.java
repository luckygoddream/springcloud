package controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: jwq
 * @Date: 2020/12/23 10:34
 */
public class LunchDown {
    public static void main(String[] args) {
        try {


            List<String>aaaa= Arrays.asList("1","5","3");
            List<String>aaaa1=Arrays.asList("6","4","2");


//            List<Integer> list = Stream.of(1,3)
//                    .flatMap(t -> {
//                        Stream stream = Collection.stream(t);
//                        return stream;
//                    })
//                    .distinct()
//                    .collect(Collectors.toList());


            List<String> dayList = Stream.of(aaaa, aaaa1)
                    .flatMap(Collection::stream)
                    .distinct()
                    .collect(Collectors.toList());

            dayList.forEach(System.out::println);

        }catch (Exception e){
            System.out.println(e);
        }

     }
}
