package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int testscore;
	public Student() {
		super();
	}
	public Student(int id, String name, int testscore) {
		super();
		this.id = id;
		this.name = name;
		this.testscore = testscore;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTestscore() {
		return testscore;
	}
	public void setTestscore(int testscore) {
		this.testscore = testscore;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", testscore=" + testscore + "]";
	}
}
