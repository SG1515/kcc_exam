package kosa.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoardController {
	private Board[] board = new Board[100];
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int idx = 0;
	
	public BoardController () {
		
	}
	
	public void create() throws IOException{
		System.out.println("�� ������ �Է����ּ���");
		String name = br.readLine();
		System.out.println("�� ������ �Է����ּ���");
		String str = br.readLine();
		System.out.println("�г����� �Է����ּ���");
		String nickName = br.readLine();
		System.out.println("��й�ȣ�� �Է����ּ���");
		int password = Integer.parseInt(br.readLine());
		
		board[idx++] = new Board(idx, name, str, nickName, password);
		System.out.println();
	}
	
	
	
	public void read() throws IOException {
		System.out.println("���° ���� �о�ñ��?");
		st = new StringTokenizer(br.readLine());
		int find = Integer.parseInt(st.nextToken());
		boolean search = false;

		for(int i=0; i<idx; i++) {
			if(find == (i+1)) {
				Board b = board[i];
				if(b == null) {
					break;
				}
				System.out.println("���� : " + b.getName());
				System.out.println("���� : " + b.getStr());
				System.out.println();
				search = true;
			}
		}
		
		if(!search) System.out.println("�ش� ���� �����Ǿ��ų� �������� �ʽ��ϴ�.");
		System.out.println();
	}
	
	public void totalRead() {
		
	}
	
	
	public void update() throws IOException {
		System.out.println("���° ���� �����ұ��?");
		st = new StringTokenizer(br.readLine());
		int find = Integer.parseInt(st.nextToken());
		boolean search = false;

		for(int i=0; i<idx; i++) {
			if(find == (i+1)) {
				Board b = board[i];
				System.out.println("password�� �Է����ּ���.");
				int password = Integer.parseInt(br.readLine());
				
				if(password == b.getPassword()) {
					System.out.println("������ �� ������ �Է��ϼ��� : ");
					String str1 = br.readLine();
					b.setName(str1);
					
					System.out.println("������ �� ������ �Է��ϼ��� : ");
					String str2 = br.readLine();
					b.setStr(str2);
					
					search = true;
				} else {
					System.out.println("��й�ȣ�� �ٸ��ϴ�.");
					break;
				}
				
			} 
		}
		if(!search) System.out.println("�ش� ���� �����ϴ�.");
		System.out.println();
	}
	
	
	public void delete() throws IOException {
		System.out.println("���° ���� �����ұ��?");
		st = new StringTokenizer(br.readLine());
		int find = Integer.parseInt(st.nextToken());
		
		board[find-1] = null;
		System.out.println("���� �Ǿ����ϴ�.");
		System.out.println();
	}
	
}
