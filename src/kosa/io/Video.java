package kosa.io;

import java.io.Serializable;

public class Video implements Serializable{
	private String videoNumber;
	private String name;
	private String actor;
	
	
	
	public Video(String videoNumber, String name, String actor) {
		super();
		this.videoNumber = videoNumber;
		this.name = name;
		this.actor = actor;
	}
	@Override
	public String toString() {
		return "Video [videoNumber=" + videoNumber + ", name=" + name + ", actor=" + actor + "]";
	}
	public String getVideoNumber() {
		return videoNumber;
	}
	public void setVideoNumber(String videoNumber) {
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
	

}
