package school.management.system;

/*
 * This class is responsible for keeping the track of students fees, name, grade
 * 
 * 
 */
public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/*
	 * The role of constructor is to create a new student by initializing.
	 * Fees for every student is $30 000.
	 * Fees paid initially is 0.
	 * @param id id for the student: unique
	 * @param name name of the student
	 * @param grade grade of the student.
	 */
	
	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	/*
	 * Use to update the students grade
	 * @param grade new grade of the student
	 */
	public void setGrade(int grade ) {
		this.grade = grade;
	}
	
	/*
	 * feesPaid = 10,000 + 5,000 + 15,000
	 * keep adding the fees to feesPaid field
	 * Add the fees to the fees paid. 
	 * The school is going to receive the funds.
	 */
	
	public void payFees(int fees) {
		feesPaid +=fees;
		School.updateTotalMoneyEarned(feesPaid);
		
	}
	
	/*
		return id of the student.
	*/

	public int getId() {
		return id;
	}
	
	/*
		return name of the student.
	*/
	
	public String getName() {
		return name;
	}
	
	/*
		return grade of the student.
	*/
	
	public int getGrade() {
		return grade;
	}
	
	/*
		return feesPaid of the student.
	*/
	
	public int getFeesPaid() {
		return feesPaid;
	}
	
	/*
		return feesTotal of the student.
	*/
	
	public int getFeesTotal() {
		return feesTotal;
	}
	
	/*
		return remaining balance
	*/
	
	public int getRemainingFees() {
		return feesTotal-=feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student's name: "+name+" Total fees paid so far $"+ feesPaid;
	}

}
