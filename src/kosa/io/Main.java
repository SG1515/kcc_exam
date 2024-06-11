package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	Member m;
	
	//객체 직렬화
	public void insert() {
		m = new Member("홍길동", 20, new Video("1", "서울의봄", "정우성"));
		ObjectOutputStream oos = null;
		try {
			//oos에 멤버객체를 쓰면 파일에 들어가는지 테스트 
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
	//객체 역직렬화
	public void show() {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member) ois.readObject();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.insert(); //직렬화가 이루어짐
		main.m = null; //메모리에서 삭제하기. 실제 멤버객체를 파일에만 두기 위해서
		main.show(); //역직렬화가 이루어짐
		System.out.println(main.m);
	}
}

