package gyak3;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class I40fdc_3_1 {
	public static void main(String[] args) {
		
		 try {
		      FileWriter myWriter = new FileWriter("file.txt");
		      myWriter.write("3"+ "\r\n" + "8");
		      myWriter.close();
		 } catch (IOException e) {
		      System.out.println("Error");
		      e.printStackTrace();
		 }
		 
		 Scanner scanner = null;
		try {
			scanner = new Scanner(new File("file.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		 int [] num = new int [100];
		 int i = 0;
		 while(scanner.hasNextInt())
		 {
		      num[i++] = scanner.nextInt();
		 }
		 
		 System.out.println("Adatok szama: ");
	}
}

