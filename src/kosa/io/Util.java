package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Util  {
	static String path = "C:\\work\\upload";
	static StringTokenizer st;
	public void ls() {
		// 현재 디렉터리에 있는 것 목록 보기
		File f = new File(path);
		lsFile(f);
		
	}

	private void lsFile(File f) {
		File[] arr = f.listFiles();
		
		for(File x : arr) {
			if(x.isDirectory()) {
				System.out.println("d " + x.getName() );
			} else {
				System.out.println("f " + x.getName());
			}
		}
		
	}

	public void cd(String str) {
		//공백이 두개 이상이면 return 해버리자.
		File f = new File(path);
		File[] arr = f.listFiles();
		
		String[] strTmp = str.split(" ");
		String tmp = "";
		int name = 1;
		boolean find = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].getName().equals(strTmp[name])){
				tmp = path + "\\" + strTmp[name];
				path = "" + tmp;
				find =true;
				System.out.println(path);
			}
		}
		if(!find) System.out.println("not found directory"); 
		
	}

	public void back() {
		String[] pathTmp = path.split("\\\\");

		String tmp = "";
		
		for(int i=0; i<pathTmp.length-1; i++) {
			tmp += pathTmp[i];
			if(i<pathTmp.length-2)
			tmp += "\\";
		}
		path = "" + tmp;
		System.out.println(tmp);
		
	}

	public void mkdir(String name) {
		String[] tmp = name.split(" ");
		
		File f = new File(path, tmp[1]);
		f.mkdir();
		
	}

	public void vi(String name) throws IOException{
		String[] tmp = name.split(" ");
		String fileName = tmp[1];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter(path + "\\" + fileName);
		System.out.println("--------------------");
		String str;
		
		while((str = br.readLine()) != null) {
			if (str.equals("q")) break;
			str += "\n";
			fw.write(str);
			
		}
		fw.close();

		

		System.out.println("종료");
		
		
	}


	private void copyFile(File s, File d) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		byte arr[] = new byte[1024];
		int data =0;
		try {
			fis = new FileInputStream(s);
			fos = new FileOutputStream(d);
			
			while ( (data = fis.read(arr)) != -1) {
				fos.write(arr, 0, data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	} // end of copyFile
	
	
}
