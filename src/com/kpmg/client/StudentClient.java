package com.kpmg.client;

import java.util.Scanner;

import com.kpmg.service.StudentService;

public class StudentClient {

	public static void main(String[] args) {
		
		StudentService s= new StudentService();
		s.createStudent();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("please enter the numbers for following operations");
		System.out.println("1: Update Employee // 2: Remove the employee // 3: add student" );
		
		int x= sc.nextInt();
		
		switch (x) {
			case 1:
				System.out.println("please enter the id number for Update the student");
				int a= sc.nextInt();
				s.updateStudent(a);
				break;
			case 2:
				System.out.println("please enter the id number for Remove the student");
				int y= sc.nextInt();
				s.removeStudent(y);
				break;
			case 3:
				int sid= sc.nextInt();
				String sname= sc.next();
				String sclass = sc.next();
				
				s.addStudent(sid, sname, sclass);
				break;
		}
	}
}
