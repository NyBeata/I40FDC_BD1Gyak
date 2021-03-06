package gyak3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class I40FDC_3_3 {
	public static void main(String[] args) {
		String sor;
		String[] szavak;
		int sorid = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = null;
			
			while(sorid >= 0) {
				sor = br.readLine();
				if(sorid == 0) {
					bw = new BufferedWriter(new FileWriter(sor));
				} else {
					bw.write(sor);
					bw.newLine();
				}
				sorid = sorid + 1;
				szavak = sor.split(" ");
				for(String sz : szavak) {
					System.out.println(sz + ":");
					if(sz.compareTo("end") == 0) {
					br.close();
					sorid = -1;
					}
				}	
			}
			bw.close();
			System.out.println("Ok");
		}catch(Exception ee) { ee.printStackTrace(); }
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("fnev"));
			while((sor = br.readLine()) != null) {
				System.out.println(sor.toUpperCase());
			}
			br.close();
			System.out.println("Ok");
		} catch(Exception ee) { ee.printStackTrace(); }	
	}
}
