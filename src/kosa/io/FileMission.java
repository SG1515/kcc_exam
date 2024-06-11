package kosa.io;

import java.io.File;
import java.io.IOException;

public class FileMission {

	public static void main(String[] args) throws IOException {
		// 1.바이트 스트림을 이용하여 이미지파일을 복사해보자.
//		CopyUtil copyutil = new CopyUtil();
//		String source = "C:\\work\\java_work\\Kcc_java\\image.jpg";
//		String dest = "C:\\work\\upload\\image.jpg";
//		
//		File s = new File(source);
//		File d = new File(dest);
//		
//		copyutil.copyFile(s, d);
		
		// 2. 디렉터리 안에 폴더
		String source = "C:\\work\\json";
		String dest = "C:\\work\\upload";
		
		CopyUtil.copyDirectory(new File(source), new File(dest));
		
	}

}
