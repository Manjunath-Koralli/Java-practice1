package com.ex.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream infile = null;
		try {
			infile = new FileInputStream("C:\\Users\\Ransomware_Manja\\eclipse-workspace\\Java_Practice\\file3.txt");
			int b;
			while((b = infile.read())!= -1) {
				//System.out.println(b);
				System.out.print((char)b);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		FileOutputStream ofile = null;
		byte b[] = {'M','l','o','r','e'};
		try {
			ofile = new FileOutputStream("C:\\Users\\Ransomware_Manja\\eclipse-workspace\\Java_Practice\\file3.txt");
			ofile.write(b);
			ofile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
