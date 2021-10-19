package controller;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.sql.Array;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular {
    public static void main(String[] args) {
        //String s  = "/^\\w+((-\\w)|(\\.\\w))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$/";
        //String s = "/^\\w+(?:\\.\\w+){0,1}@[a-zA-Z0-9]{2,14}(?:\\.[a-z]{2,4}){1,2}$/";
       //String check = "^([a-z0-9A-Z]+[-|\\._]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z.]{2,}$";
        //Pattern pattern = Pattern.compile(check);
        String mail = "adrian.smith1975icloud.uk.9";
        //Matcher matcher = pattern.matcher(mail);
        //boolean flag = matcher.matches();
        boolean flag = mail.contains("@");
        System.out.println(flag);
//        String s = "S1";
//        char [] chars = s.toCharArray();
//        System.out.println(chars[1]);

//        int i = 60 / 1440;
//        double j = 5.00 * 1000;
//        System.out.println(j);
//        System.out.println(i);
//
//        long x = TimeUnit.MINUTES.toMinutes(1440);

//        int nn = 1;
//        System.out.println(nn == 1);
//        System.out.println(x);
//        Map map = new HashMap();
//        map.put("tp",null);
//        Object tp = map.get("tp");
//        System.out.println(tp);
//        System.out.println(11  /10);

        //获取秒数
//        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
//        //获取毫秒数
//        Long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
//
//
//        //时间转字符串格式化
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
//        String dateTime = LocalDateTime.now(ZoneOffset.of("+8")).format(formatter);
//
//       //字符串转时间
//        String dateTimeStr = "2018-07-28 14:11:15";
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime date = LocalDateTime.parse(dateTimeStr, df);
//        List list2 = new ArrayList();
//        List list = new ArrayList();
//        list.add(1);
//        list.add(2);
//
//        list2.addAll(list);
//        list.clear();
//        System.out.println(list2);
        List<String> list1 = new ArrayList<String>(Arrays.asList("a","b","c"));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));

        boolean f = list1.getClass() == list2.getClass();
        System.out.println(f);
        BigDecimal bigDecimal  = BigDecimal.ZERO;
        System.out.println(bigDecimal);
//        LoadingCache<String,String> cache = CacheBuilder.newBuilder().concurrencyLevel(20).


}
    }
