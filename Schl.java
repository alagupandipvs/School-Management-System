package School_Management_System;
import java.util.*;

public class Schl {
	/**
	 * the school have many teachers and students.
	 * 
	 * to impleament ArreayList in students and teacher class.
	 */

	 
	private List<Teachers> teachers ;
	private List<Student> students;
	private static int totalMoneyEarned;
	private  static int totalMoneySpent;
 
	public Schl(List<Teachers> teachers, List<Student> students) {
		this.teachers = teachers;
	 	this.students = students;
	 	this.totalMoneyEarned=0;
	 	this.totalMoneySpent=0;
	}

	public List<Teachers> getTeachers() {
		return teachers;
	}

	public void addTeachers(Teachers teacher) {
		teachers.add(teacher) ;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudents(Student student) {
		students.add(student);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static  void updateTotalMoneyEarned(int totalMoneyEarned) {
		Schl.totalMoneyEarned += totalMoneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	
/**
 * teachers salery
 * @param totalMoneySpent
 */
	public static void updateTotalMoneySpent(int totalMoneySpent) {
		totalMoneyEarned-=totalMoneySpent;
		totalMoneySpent += totalMoneySpent;
	}
	
	

}
