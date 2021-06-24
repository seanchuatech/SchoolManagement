package school.management.system;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	/*
	 * return ID of the teacher
	 */
	
	public int getId() {
		return id;
	}
	
	/*
	 * return name of the teacher
	 */
	
	public String getName() { 
		return name;
		
	}
	
	/*
	 * return salary of the teacher
	 */
	
	public int getSalary() {
		return salary;
	}
	
	/*
	 * update the salary
	 */
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/*
	 * adds to salary
	 * deduct from total money earned
	 * @param salary
	 */
	
	public void receiveSalary(int salary) {
		salaryEarned +=salary;
		School.updateTotalMoneySpent(salary);
		
	}
	
	@Override
	public String toString() {
		return "Name of the Teacher: " + name + " Total Salary earned so far $" + salaryEarned;
	}
}
