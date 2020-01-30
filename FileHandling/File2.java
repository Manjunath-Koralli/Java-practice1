package com.ex.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File infile = new File("C:\\Users\\Ransomware_Manja\\eclipse-workspace\\Java_Practice\\file4.txt");
		File outfile = new File("C:\\Users\\Ransomware_Manja\\eclipse-workspace\\Java_Practice\\file5.txt");
		
		FileReader fr = null;
		FileWriter fw = null;
		int ch;
		try {
			fr = new FileReader(infile);
			fw = new FileWriter(outfile);
			while((ch = fr.read())!= -1) {
				fw.write(ch);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				fr.close();
				fw.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
