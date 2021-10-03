package feladat6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class I40FDC_3_6 {
	public static void main(String[] args) {
		Auto[] autoim = {new Auto("R11","Opel",333),new Auto("R12","Fiat",233),new Auto("R14","Skoda",364)};
		try {
			ObjectOutputStream kifile = new ObjectOutputStream(new FileOutputStream("Autok.dat"));
			for(Auto auto : autoim) {
				kifile.writeObject(auto);
			}
			kifile.close();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("File nyitasi hiba");
		}
		System.out.println("Ok");
	}

}
