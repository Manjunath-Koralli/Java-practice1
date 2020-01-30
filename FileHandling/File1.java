//C:\Users\Ransomware_Manja\eclipse-workspace\Java_Practice
package com.ex.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\Ransomware_Manja\\eclipse-workspace\\Java_Practice\\file3.txt");
		try {
			if(f1.createNewFile()) {
				System.out.println(f1.getName() + " is created");
			}
			else {
				System.out.println(f1.getName() + " already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		if(f1.exists()) {
			System.out.println(f1.getName());
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.getParent());
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			System.out.println(f1.length());
		}
		else {
			System.out.println("doesnt exist");
		}
		
		System.out.println();
		
		try {
			FileWriter fwriter = new FileWriter("C:\\Users\\Ransomware_Manja\\eclipse-workspace\\Java_Practice\\file3.txt");
			fwriter.write("Manjunath Sahyadri College");
			fwriter.close();
			System.out.println("Written successfully");
			//System.out.println(f1.length());
			//fwriter.write("Manjunath Sahyadri College");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			FileReader fr = new FileReader(f1);
			int ch;
			while((ch = fr.read())!= -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			Scanner sc = new Scanner(f1);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
