package com.zjd.jimao.MQ;

import java.util.HashMap;

import static java.lang.Integer.*;

public class HoneMQ {


    public static void main(String[] args) {

        //设 key 为水果类型  y为水果打折力度
        //key 为类型id  value 为 数量：折扣
        String fruit = "1:5:1,2:9:9,3:10:1";
        String fullRed = "300:10";
//        int fruit1 = getFruit(fruit);
        int fruit1 = getfullReduction(fruit, fullRed);
        System.out.println(fruit1);

    }

    //满减政策，用fullred判断是否有满减
    public static int getfullReduction(String fruit, String fullRed) {
        //未满减之前
        int money = getFruit(fruit);
        if (fullRed == null || fullRed.equals("")) {
            return money;
        }
        String[] split = fullRed.split(":");
        int a = parseInt(split[0]);
        int b = parseInt(split[1]);
        money -= (money / a) * b;
        return money;
    }


    //组装水果集合
    public static int getFruit(String fruit) {
        HashMap<Integer, String> price = new HashMap<>();
        if (fruit == null) {
            return 0;
        }
        String[] split = fruit.split(",");
        for (int i = 0; i < split.length; i++) {
            String[] split1 = split[i].split(":");
            Integer nums = valueOf(split1[1]);
            price.put(parseInt(split1[0]), nums + ":" + split1[2]);
        }
        int money = getMoney(price);
        System.out.println(money);
        return money;

    }


    //获取钱
    public static int getMoney(HashMap<Integer, String> map) {
        int valus = 0;
        for (int i : map.keySet()) {
            String s = map.get(i);
            String[] split = s.split(":");
            Fruit fruitById = Fruit.getFruitById(i);
            Float value = fruitById.getValue();
            if (Integer.parseInt(split[1]) > 1) {
                valus += value * Float.parseFloat(split[0]) * (Float.parseFloat(split[1]) / 10.0);
            } else {
                valus += value * Float.parseFloat(split[0]);
            }
        }
        return valus;
    }


}
