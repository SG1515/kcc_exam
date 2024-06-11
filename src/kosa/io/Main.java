package kosa.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	Member m;
	
	//��ü ����ȭ
	public void insert() {
		m = new Member("ȫ�浿", 20, new Video("1", "�����Ǻ�", "���켺"));
		ObjectOutputStream oos = null;
		try {
			//oos�� �����ü�� ���� ���Ͽ� ������ �׽�Ʈ 
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
	
	//��ü ������ȭ
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
		main.insert(); //����ȭ�� �̷����
		main.m = null; //�޸𸮿��� �����ϱ�. ���� �����ü�� ���Ͽ��� �α� ���ؼ�
		main.show(); //������ȭ�� �̷����
		System.out.println(main.m);
	}
}

