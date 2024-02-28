package com.hughes.assignment;
import java.util.*;

//create an program,which will display
//latitude and longitude based on cityname.
//Use Map .
public class Collection3 {

	public static void main(String[] args) {
		HashMap<String,float[]> map=new HashMap<>();
		map.put("hydrebad",new float[] {18.956421f, 72.800308f});
		map.put("Mumbai", new float[] {19.075983f, 72.877655f});
		map.put("Chennai", new float[] {13.082680f, 80.270721f});
		map.put("Calcutta", new float[] {22.572645f, 88.363892f});
		map.put("Bihar", new float[] {25.096073f, 85.313118f});
		
//		System.out.println(map);
		for(String s : map.keySet())
		{
			System.out.println(s+"-> "+Arrays.toString(map.get(s)));
		}
	}

}
