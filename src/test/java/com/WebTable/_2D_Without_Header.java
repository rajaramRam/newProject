package com.WebTable;

import java.util.ArrayList;
import java.util.List;

public class _2D_Without_Header {

	
	
	public static void main(String[] args) {

		List <ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> r1 = new ArrayList<String>();
		r1.add("rajaram");
		r1.add("22");
		r1.add("chennai");
		
		ArrayList<String> r2 = new ArrayList<String>();
		r2.add("raj");
		r2.add("28");
		r2.add("bangalore");
		
		ArrayList<String> r3 = new ArrayList<String>();
		r3.add("ram");
		r3.add("25");
		r3.add("cbe");
		
		list.add(r1);
		list.add(r2);
		list.add(r3);
		
		for (ArrayList<String> string : list) {
			
			System.out.println(string);
		}
		
		ArrayList<String> arrayList = list.get(1);
		
		String string = arrayList.get(2);
		
		System.out.println(string);
	}
	
	
}


