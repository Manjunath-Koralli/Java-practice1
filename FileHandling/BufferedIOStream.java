package com.ex.FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Ransomware_Manja\\eclipse-workspace\\Java_Practice\\file3.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "Manjunath Sahyadri College";
			byte b[] = s.getBytes();
			bout.write(b);
			bout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fout = new FileInputStream("C:\\Users\\Ransomware_Manja\\eclipse-workspace\\Java_Practice\\file3.txt");
			BufferedInputStream bout = new BufferedInputStream(fout);
			int ch;
			while((ch = bout.read())!= -1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
