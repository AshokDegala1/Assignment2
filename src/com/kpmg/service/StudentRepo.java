package com.kpmg.service;

public interface StudentRepo {

	void updateStudent(int id);
	void removeStudent(int id);
	void addStudent(int id,String name,String sclass);
}
