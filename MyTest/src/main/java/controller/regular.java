package controller;

import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


public class regular {
    public static void main(String[] args) {
    User user = new User();
        int age = user.getAge();
        user.setAge(5);
        System.out.println(age);
        int i = 3;
        while (i>0){
            if (i > 1){
                i--;
            }else {
                break;
                
            }
        }
        System.out.println(i);


    }

    @Data
    static class User{
        private int age ;

        private String name;
    }

    }
