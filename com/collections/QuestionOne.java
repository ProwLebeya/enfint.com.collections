package com.collections;

import java.util.*;

public class QuestionOne{
	public static void main(String[] args) throws Exception {
		
        Map<Integer, String> map = new HashMap<>();

		map.put(10, "Ten");
		map.put(50, "Hundred");
		map.put(12, "Thousand");
        map.put(22, "Thousand");
        map.put(-10, "Thousand");
        map.put(3, "Thousand");

        int minKey = Collections.min(map.keySet());

        System.out.println("The key/value pair of the lowest key is: " + minKey+ ":" + map.get(minKey));
        map.entrySet().removeIf(entry -> entry.getKey().equals(minKey)); //removing the key/value pair from hashmap
        System.out.println("Modified HashMap: "+ map);
	}
}
