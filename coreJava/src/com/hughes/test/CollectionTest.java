package com.hughes.test;

//if i give input as 1,
//
//then data shld be inserted
//
//input is 2
//
//then data shld be deleted
//
//input is 3
//
//then data shld be displayed
//
//input is 4
//
//then duplicate values shld be displayed
// 
//note:switch
// 

import java.util.Scanner;
import java.util.Vector;

public class CollectionTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector obj = new Vector();
		int n=0;
		while (true) {
			n = sc.nextInt();
			switch (n) {
			case 1: {
				int size = sc.nextInt();
				while (size > 0) {
					obj.add(sc.next());
					--size;
				}
				System.out.println("Values Inserted");
				break;
			}
			case 2: {
				obj.remove(sc.next());
				break;
			}
			case 3: {
				System.out.println(obj);
				break;
			}
			case 4: {
				for (int i=0;i<obj.size();++i) {
					for(int j=i+1;j<obj.size();++j) {
						if(obj.get(i).equals(obj.get(j))) System.out.println(obj.get(j));
					}
				}
				break;
			}
			default:
			{
	1			return;
			}
			}
		}
	}

}
