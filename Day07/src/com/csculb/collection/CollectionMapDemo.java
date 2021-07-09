package com.csculb.collection;

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

public class CollectionMapDemo {

    public static void main(String[] args) {
        Map maps = new HashMap<Integer, String>();
        maps.put(1, "Mg Mg");
        maps.put(2, "Mg Hla");
        String name = (String) maps.get(1);
        System.out.println(name);

        long count = Stream.of(maps)
                .filter((map) -> map.containsKey(1))
                .count();
    }
}
