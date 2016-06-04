package com.acadgild.assignment.hashSet.collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
public static void main(String[] args) {
		
		HashSet names = new HashSet();
		
		names.add("Apple");
		names.add("Orange");
		names.add("Grapes");
		names.add("Apple");
		
		Iterator iters = names.iterator();
		while(iters.hasNext()){
			System.out.println(iters.next());
		}
	}
}
