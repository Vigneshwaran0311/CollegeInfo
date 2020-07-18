package org.college;

public class College {
	private void collegeName() {
		// TODO Auto-generated method stub
		System.out.println("college name is MEC");

	}
	private void collegeCode() {
		// TODO Auto-generated method stub
		System.out.println("College code is 4216");

	}
	public static void main(String[] args) {
		Student c=new Student();
	    c.studentName();
	    c.studentId();
		
		
		College e=new College();
		e.collegeName();
		e.collegeCode();
		
		Hostel h=new Hostel();
		h.hostelName();
		h.messName();
		
	}
	

}
