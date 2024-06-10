package kosa.video;

import java.util.ArrayList;

public class GeneralMember {

	private String id;
	private String name;
	private String address;
	private int videoNumber;
	private ArrayList<Video> videos;
	private Video rentalVideo;

	public GeneralMember () {
		
	}
	
	public GeneralMember(String id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
		videos = new ArrayList<Video>();
	}
	
	public void rental(Video video) {
		this.rentalVideo = video;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getVideoNumber() {
		return videoNumber;
	}

	public void setVideoNumber(int videoNumber) {
		this.videoNumber = videoNumber;
	}

	public void borrowVideo(Video video) {
		videos.add(video);
	}
	
	public void removeVideo(Video video) {
		String name = video.getName();
		if(videos.contains(video))
			videos.remove(video);
		System.out.println(name + "의 비디오가 삭제되었습니다.");
	}
	
	

	public void printVideo() {
		for(Video v : videos) {
			System.out.println("회원이 대여한 비디오 번호 : " + v.getVideoNumber() );
			System.out.println("회원이 대여한 비디오 제목 : " + v.getName() );
			System.out.println("회원이 대여한 비디오 주인공 : " + v.getActor() );
		}	
	}

	public void printInfo() {
		System.out.println("회원의 아이디 : " + id);
		System.out.println("회원의 이름 : " + name);
		System.out.println("회원의 주소 : " + address);
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("회원의 아이디 : " + id);
		System.out.println("회원의 이름 : " + name);
		System.out.println("회원의 주소 : " + address);
		rentalVideo.show();
	}
	
	
}
