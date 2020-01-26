package com.ex.string;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		String equalS1 = s1;
		System.out.println("EqualS1 hashcode" + " " + equalS1.hashCode());
		s1 = "World";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1 = s1.concat(" Hello");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1 = s1 + "manju";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println();
		
		char ch[] = {'a','b'};
		String s2 = new String(ch);
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		System.out.println();
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.hashCode());
		StringBuffer s3 = new StringBuffer("Manju");
		System.out.println(s3.capacity());
		System.out.println(s3);
		System.out.println(s3.hashCode());
		s3.append(" Koralli");
		System.out.println(s3);
		System.out.println(s3.hashCode());
		s3.insert(13," sahyadri");
		System.out.println(s3);
		System.out.println(s3.hashCode());
		
		s3.replace(14,15,"S");
		System.out.println(s3);
		System.out.println(s3.hashCode());
		
		s3.reverse();
		System.out.println(s3);
		System.out.println(s3.hashCode());
		
		System.out.println();
		String s4 =  new String("Welcome");
		System.out.println(s4.hashCode());
		String s5 =  new String("Welcome");
		System.out.println(s5.hashCode());
		
		System.out.println();
		String s6 = "Manja";
		System.out.println(s6);
		System.out.println(s6.hashCode());
		s6 = s6.concat("Koralli");
		System.out.println(s6);
		System.out.println(s6.hashCode());
		String s7 = "Manja";
		System.out.println(s7.hashCode());
		
		String equals1 = "Manju";
		String equals2 = "Manju";
		
		String equals3 = new String("Manju");
		String equals4 = new String("Manju");
		if(equals1 == equals2) {
			System.out.println("===");
		}
		
		else if(equals1.equals(equals2)) {
			System.out.println("equals method");
		}
		
		if(equals3 == equals4) {
			System.out.println("===");
		}
		
		else if(equals3.equals(equals4)) {
			System.out.println("equals method");
		}
		

	}

}
