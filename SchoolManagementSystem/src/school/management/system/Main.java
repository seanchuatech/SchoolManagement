package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher sean = new Teacher(2, "Sean", 500);
		Teacher leonard = new Teacher(3, "Lizzy", 600);
		
		List<Teacher> teacherList = new ArrayList<>();
		
		teacherList.add(lizzy);
		teacherList.add(sean);
		teacherList.add(leonard);
		
		Student tamara = new Student(1, "Tamara", 4);
		Student laura = new Student(2, "Laura", 11);
		Student john = new Student(3, "John", 12);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tamara);
		studentList.add(laura);
		studentList.add(john);
		
		School ghz = new School(teacherList, studentList);
		
		Teacher megan = new Teacher(4, "Megan", 1000);
		
		ghz.addTeacher(megan);
		
		tamara.payFees(2000);
		laura.payFees(5000);
		System.out.println("Earned: $" + ghz.getTotalMoneyEarned());
		
		System.out.println("GHZ PAYING SALARY");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("GHZ has spent for salary to " + lizzy.getName() + " and now has " + ghz.getTotalMoneyEarned());
		
		sean.receiveSalary(sean.getSalary());
		System.out.println("GHZ has spent for salary to " + sean.getName() + " and now has " + ghz.getTotalMoneyEarned());
		
		System.out.println(john);
		System.out.println(sean);
		System.out.println(leonard);
		System.out.println(megan);
		
	}

}
