package com.hand.entity;

public class Film extends IdEntity {
	private int film_id;
	private String title;
	private String description;
	private String name;

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// @Override
	// // public String toString() {
	// // return "User [name=" + name + ", id=" + id + "]";
	// // }

}
