package kosa.io;

import java.io.File;
import java.io.IOException;

public class FileMission {

	public static void main(String[] args) throws IOException {
		// 1.����Ʈ ��Ʈ���� �̿��Ͽ� �̹��������� �����غ���.
//		CopyUtil copyutil = new CopyUtil();
//		String source = "C:\\work\\java_work\\Kcc_java\\image.jpg";
//		String dest = "C:\\work\\upload\\image.jpg";
//		
//		File s = new File(source);
//		File d = new File(dest);
//		
//		copyutil.copyFile(s, d);
		
		// 2. ���͸� �ȿ� ����
		String source = "C:\\work\\json";
		String dest = "C:\\work\\upload";
		
		CopyUtil.copyDirectory(new File(source), new File(dest));
		
	}

}
