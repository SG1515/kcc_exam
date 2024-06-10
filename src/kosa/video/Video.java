package kosa.video;

import java.util.ArrayList;

public class Video {
	
	private int videoNumber;
	private String name;
	private String actor;
	public Video() {
		
	}
	
	public Video(int videoNumber, String name, String actor) {
		this.videoNumber = videoNumber;
		this.name = name;
		this.actor = actor;
	}
	
	public void videoInfo() {
		System.out.println("�ش� ������ ��ȣ�� : " + videoNumber);
		System.out.println("�ش� ������ �̸��� : " + name);
		System.out.println("�ش� ������ �ֿ����� : " + actor);
	}
	

	public int getVideoNumber() {
		return videoNumber;
	}

	public void setVideoNumber(int videoNumber) {
		this.videoNumber = videoNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void show() {
		System.out.println("ȸ���� ���� ���� ��ȣ : " + videoNumber);
		System.out.println("ȸ���� ���� ���� ���� : " + name);
		System.out.println("ȸ���� ���� ���� ��� : " + actor);	
	}
	
	

}
