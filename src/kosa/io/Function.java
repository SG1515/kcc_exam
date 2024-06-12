package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Function {

	public static void ls(File file) {
		File[] fileList = file.listFiles();

		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				System.out.println(fileList[i].getName() + " <DIR> ");
			} else {
				System.out.println(fileList[i].getName());
			}
		}
	}

	public static File cdChild(File file, String name) {

		File newFile = new File(file.getAbsolutePath(), name);

		if (!newFile.exists()) {
			System.out.println("해당 디렉토리가 존재하지 않습니다.");
			return file;
		}

		return newFile;
	}

	public static File cdParent(File file) {

		File newFile = file.getParentFile();
		
		if(newFile == null) {
			return file;
		}
		
		return file.getParentFile();
	}

	public static void mkdir(File file, String name) {

		File dest = new File(file.getAbsolutePath(), name);

		dest.mkdir();
	}

	private static void cpFile(File source, File dest) {
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream(source.getAbsolutePath());
			os = new FileOutputStream(dest.getAbsolutePath());

			byte[] data = new byte[1024];

			while (true) {
				int num = is.read(data);

				if (num == -1)
					break;
				os.write(data, 0, num); // 실제 읽어온 데이터 크기만큼 작성
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.flush();
					os.close();
				}

				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void cp(File source, File dest) {
		if (source.isDirectory()) {
			dest.mkdir();

			File fileList[] = source.listFiles();

			for (int i = 0; i < fileList.length; i++) {
				File d_destFile = new File(dest, fileList[i].getName());

				if (fileList[i].isDirectory()) {
					cp(fileList[i], d_destFile);
				} else {
					File f_destFile = new File(dest, fileList[i].getName());
					cpFile(fileList[i], f_destFile);
				}
			}
		}
		System.out.println(source.getName() + " 복사완료");
	}
}