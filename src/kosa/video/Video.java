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
		System.out.println("해당 비디오의 번호는 : " + videoNumber);
		System.out.println("해당 비디오의 이름은 : " + name);
		System.out.println("해당 비디오의 주연배우는 : " + actor);
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
		System.out.println("회원이 빌린 비디오 번호 : " + videoNumber);
		System.out.println("회원이 빌린 비디오 제목 : " + name);
		System.out.println("회원이 빌린 비디오 배우 : " + actor);	
	}
	
	

}
