package com.WebTable;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _1D_With_Header {

	
	public static void main(String[] args) {
		
		

		
		
		Map<Integer, String> mp = new LinkedHashMap<Integer, String>();
		
		mp.put(1, "java");
		mp.put(2, "selenium");
		mp.put(3, "python");
		mp.put(4, "sql");
		mp.put(5, "oracle");
		
		Set<Entry<Integer,String>> entrySet = mp.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry);
		
		
		}
		
		mp.put(4, "ruby");
		
		
		System.out.println(mp);
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

	
	
	
	
	
}
