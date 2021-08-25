package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular {
    public static void main(String[] args) {
        //String s  = "/^\\w+((-\\w)|(\\.\\w))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$/";
        //String s = "/^\\w+(?:\\.\\w+){0,1}@[a-zA-Z0-9]{2,14}(?:\\.[a-z]{2,4}){1,2}$/";
//        String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
//        Pattern pattern = Pattern.compile(check);
//        String mail = "11@1.NET";
//        Matcher matcher = pattern.matcher(mail);
//        boolean flag = matcher.matches();
//        System.out.println(flag);
        String s = "S1";
        char [] chars = s.toCharArray();
        System.out.println(chars[1]);

    }
}
