package com.qa.cdstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CD {

	@Id
	private int id;
	
	private String artist;
	
	private String song;
	
	private String genre;
	
	public CD()
	{
		
	}
	
	public CD(int id, String artist, String song, String genre) {
		this.id = id;
		this.artist = artist;
		this.song = song;
		this.genre = genre;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
