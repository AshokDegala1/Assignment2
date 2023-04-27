package com.kpmg.service;

import java.util.ArrayList;
import java.util.List;

import com.kpmg.bean.Student;

public class StudentService implements StudentRepo {
	
	
	List<Student> list = new ArrayList<Student>();
	
	public void createStudent() {
		
		Student s =new Student();
		s.setSid(1);
		s.setSname("Amit");
		s.setSclass("Java Training");
		Student s1 =new Student();
		s1.setSid(2);
		s1.setSname("Ashok");
		s1.setSclass("Java Training");	
		Student s2 =new Student();
		s2.setSid(3);
		s2.setSname("Rohit");
		s2.setSclass("Java Training");	
		list.add(s);
		list.add(s2);
		list.add(s1);
		
		for(Student s3:list) {
			System.out.println(s3.getSid()+" "+s3.getSname()+" "+s3.getSclass());
		}
		
	}

	
	@Override
	public void updateStudent(int id) {
		
	for(Student s1:list) {
		if (s1.getSid()==id) {
			s1.setSname("Sasi");
		}
		System.out.println(s1.getSid()+"  "+s1.getSname()+"  "+s1.getSclass());
	}
		
		
	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		
		list.remove(id);
		for(Student s:list) {
			System.out.println(s.getSid()+"  "+s.getSname()+"  "+s.getSclass());
		}
		
	}


	@Override
	public void addStudent(int id, String name, String sclass) {
		// TODO Auto-generated method stub
		Student s =new Student(id,name,sclass);
		list.add(s);	
	}


}
