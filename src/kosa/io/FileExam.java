package kosa.io;

import java.io.File;

public class FileExam {
	static String path = "C:\\work\\java_work\\Kcc_java\\kcc_exam";
	

	public static void main(String[] args) {
		
		//경로를 통해서 객체화

		
//		if(f.isDirectory()) {
//			System.out.println("디텍터리 입니다.");
//			System.out.println(f.getName() + "폴더 입니다");
//			File arr[] = f.listFiles();
//			
//			for(File x : arr) {
//				System.out.println(x.getName());
//			}
//		} else {
//			System.out.println("디렉터리가 아닙니다.");
//		}
//		
		// 해당 디렉터리부터 하위디렉터리의 파일 다 나오게 하기
		File f = new File(path); 
		findFile(f);
		
	}
	
	public static void findFile(File f) {
		File arr[] = f.listFiles();
		for(File x : arr) 
		{
			if(x.isDirectory()) {
				System.out.println("디렉터리명은 : " + x.getName());
				findFile(x);
			} else {
				System.out.println("하위 파일명은 : " + x.getName());
			}
		}
		
		
	}

}
