package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

public class CopyUtil  {
	
	//디렉터리 복사 (해당 폴더 복사 새로운 디렉터리 생성 모든 파일을 복사되도록하기)
	
	
	//바이트 값을 가진 파일 1개를 복사하는 메서드
	public static void copyFile(File source, File copy) throws IOException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte arr[] = new byte[1024];
		int data =0;
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(copy);
			
			while((data = fis.read(arr)) != -1) {
				fos.write(arr, 0, data);
				
			}
			System.out.println("복사완료");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	} // end of copyFile
	
	public static void copyDirectory(File source, File dest) throws IOException {
		if(source.isDirectory()) {
			dest.mkdir();
			
			File fileList[] = source.listFiles();
			for(File x : fileList) {
				if(x.isDirectory()) {
					// new File(해당 디렉터리 겅로, 파일이름); 파일 객체를 생성할 수 있음
					// 현재경로 + x의 경로 붙여서 만들어야함
					File f = new File(dest, x.getName());
					
					copyDirectory(x,f);
				} else {
					File destFile = new File(dest, x.getName());
					copyFile(x, destFile);
				}
			}
		}
	}

}
