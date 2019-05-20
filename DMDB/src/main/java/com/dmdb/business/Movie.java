package com.dmdb.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int ID;
	  String title;
	  String rating;
	  long year;
	  String director;
	  
	public Movie() {
		super();
	}

	public Movie(int iD, String title, String rating, long year, String director) {
		super();
		ID = iD;
		this.title = title;
		this.rating = rating;
		this.year = year;
		this.director = director;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie: ID=" + ID + ", title=" + title + ", rating=" + rating + ", year=" + year + ", director="
				+ director + "\n";
	}
	  
	  
	
}
