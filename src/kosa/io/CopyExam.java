package kosa.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyExam {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		char[] arr = new char[100];
		try {
			fr = new FileReader("poem2.txt");
			fw = new FileWriter("poem3.txt");
			
			while (true) {
				Arrays.fill(arr, ' ');
				int data = fr.read(arr);
				if(data == -1) break;
				fw.write(arr);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
