package com.zjd.jimao.MQ;

import java.util.HashMap;

public enum Fruit {


    苹果(1, "苹果", 8f),
    草莓(2, "草莓", 13f),
    芒果(3, "芒果", 20f);


    int id;
    String name;
    Float value;

    Fruit(Integer id, String name, Float value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    HashMap<String, String> map;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getValue() {
        return value;
    }

//    public void setValue(String value) {
//        if (!value.contains(",")){
//            this.value = value;
//        }
//        HashMap<String, String> map = new HashMap<>();
//        String[] split = value.split(",");
//        for (int i = 0; i < split.length; i++) {
//            String[] split1 = split[i].split(":");
//            map.put(split1[0],split1[1]);
//        }
//        this.setMap(map);
//    }


    public void setValue(Float value) {
        this.value = value;
    }

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }


    public static Fruit getFruitById(int id) {

        if (id == 0) {
            return null;
        }
        Fruit types[] = Fruit.values();
        for (Fruit type : types) {
            if (type.getId() == id) {
                return type;
            }
        }

        return null;


    }
}
