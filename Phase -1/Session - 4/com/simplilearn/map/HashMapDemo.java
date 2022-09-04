package com.simplilearn.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1,  "sowmya");
		map.put(6,  "blessy");
		map.put(8,  "neeraja");
		map.put(9, "lahari");
		
		System.out.println("Map elements :"+ map);
		System.out.println("Contains key 6 ? :" + map.containsKey(6));
		System.out.println("Get value of key 8 :"+ map.get(8));
		System.out.println("Itearte using Iterator");
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("Using Iterator:");
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
