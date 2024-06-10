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
		System.out.println(name + "�� ������ �����Ǿ����ϴ�.");
	}
	
	

	public void printVideo() {
		for(Video v : videos) {
			System.out.println("ȸ���� �뿩�� ���� ��ȣ : " + v.getVideoNumber() );
			System.out.println("ȸ���� �뿩�� ���� ���� : " + v.getName() );
			System.out.println("ȸ���� �뿩�� ���� ���ΰ� : " + v.getActor() );
		}	
	}

	public void printInfo() {
		System.out.println("ȸ���� ���̵� : " + id);
		System.out.println("ȸ���� �̸� : " + name);
		System.out.println("ȸ���� �ּ� : " + address);
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("ȸ���� ���̵� : " + id);
		System.out.println("ȸ���� �̸� : " + name);
		System.out.println("ȸ���� �ּ� : " + address);
		rentalVideo.show();
	}
	
	
}
