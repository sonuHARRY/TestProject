package com.sonu;
class student
{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class encapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student();
s1.setRollno(7);
System.out.println(s1.getRollno());
s1.setName("harry");
System.out.println(s1.getName());
	}

}
