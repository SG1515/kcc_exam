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
		System.out.println("글 제목을 입력해주세요");
		String name = br.readLine();
		System.out.println("글 내용을 입력해주세요");
		String str = br.readLine();
		System.out.println("닉네임을 입력해주세요");
		String nickName = br.readLine();
		System.out.println("비밀번호을 입력해주세요");
		int password = Integer.parseInt(br.readLine());
		
		board[idx++] = new Board(idx, name, str, nickName, password);
		System.out.println();
	}
	
	
	
	public void read() throws IOException {
		System.out.println("몇번째 글을 읽어올까요?");
		st = new StringTokenizer(br.readLine());
		int find = Integer.parseInt(st.nextToken());
		boolean search = false;

		for(int i=0; i<idx; i++) {
			if(find == (i+1)) {
				Board b = board[i];
				if(b == null) {
					break;
				}
				System.out.println("제목 : " + b.getName());
				System.out.println("내용 : " + b.getStr());
				System.out.println();
				search = true;
			}
		}
		
		if(!search) System.out.println("해당 글이 삭제되었거나 존재하지 않습니다.");
		System.out.println();
	}
	
	public void totalRead() {
		
	}
	
	
	public void update() throws IOException {
		System.out.println("몇번째 글을 수정할까요?");
		st = new StringTokenizer(br.readLine());
		int find = Integer.parseInt(st.nextToken());
		boolean search = false;

		for(int i=0; i<idx; i++) {
			if(find == (i+1)) {
				Board b = board[i];
				System.out.println("password를 입력해주세요.");
				int password = Integer.parseInt(br.readLine());
				
				if(password == b.getPassword()) {
					System.out.println("수정할 글 제목을 입력하세요 : ");
					String str1 = br.readLine();
					b.setName(str1);
					
					System.out.println("수정할 글 내용을 입력하세요 : ");
					String str2 = br.readLine();
					b.setStr(str2);
					
					search = true;
				} else {
					System.out.println("비밀번호가 다릅니다.");
					break;
				}
				
			} 
		}
		if(!search) System.out.println("해당 글이 없습니다.");
		System.out.println();
	}
	
	
	public void delete() throws IOException {
		System.out.println("몇번째 글을 삭제할까요?");
		st = new StringTokenizer(br.readLine());
		int find = Integer.parseInt(st.nextToken());
		
		board[find-1] = null;
		System.out.println("삭제 되었습니다.");
		System.out.println();
	}
	
}
