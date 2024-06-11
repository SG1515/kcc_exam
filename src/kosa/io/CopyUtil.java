package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

public class CopyUtil  {
	
	//���͸� ���� (�ش� ���� ���� ���ο� ���͸� ���� ��� ������ ����ǵ����ϱ�)
	
	
	//����Ʈ ���� ���� ���� 1���� �����ϴ� �޼���
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
			System.out.println("����Ϸ�");
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
					// new File(�ش� ���͸� �Ϸ�, �����̸�); ���� ��ü�� ������ �� ����
					// ������ + x�� ��� �ٿ��� ��������
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
