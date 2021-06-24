package school.management.system;

import java.util.List;

/*
 * The school can have many teachers and many students
 * Implements teachers and student using an ArrayList.
 */

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
	/*
	 * list of teachers in the school
	 */
	
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	/*
	 * adds a teacher to the school
	 * @param teacher the teacher to be added
	 */
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	/*
	 * returns list of students to the school
	 */
	
	
	public List<Student> getStudents() {
		return students;
	}
	
	/*
	 * adds a teacher to the school
	 * @param student to be added
	 */
	
	public void addStdent(Student student) {
		students.add(student);
	}
	
	/*
	 * total money earned
	 */
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	/*
	 * adds the total money earned
	 * param MoneyEarn moen that is supposed to be added
	 */
	
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	
	/*
	 * get the total money spent by school
	 */
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	/*
	 * update the total money spend by school which is the salary given by the school to its teachers
	 */
	
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
	
	
}
