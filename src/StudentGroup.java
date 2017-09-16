import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	public void setStudents(Student[] students) {
		// Add your implementation here
		try {
			if(students == null);
				
		} catch (Exception e) {
			System.out.println("IllegalArgumentException"+e);
			
		}
		int id = 0;
		String fullName = null;
		String date = null;
		double avgMark = 0;
		int n = students.length;
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		java.util.Date testDate = null;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++){
			students[i] = new Student();
			System.out.println("Student: "+(i+1));
			System.out.println("Enter Student id:");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter fullName of Student:");
			fullName = sc.nextLine();
			System.out.println("Enter date:");
			 date = sc.nextLine();
			try{
			testDate = df.parse(date);
			} catch (ParseException e){ System.out.println("invalid format");}
						
			System.out.println("Enter Average marks scored by the Student:");
			avgMark = sc.nextDouble();

			students[i].setId(id);
			students[i].setFullName(fullName);
			students[i].setBirthDate(testDate);
			students[i].setAvgMark(avgMark);
		}
	}

	public Student getStudent(int index) throws IllegalArgumentException {
		// Add your implementation here
		try {
			if(index<0 && index < students.length)
			return students[index];
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
	}

	public void setStudent(Student student, int index) throws IllegalArgumentException{
		try {
			students[index] = student;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	
	public void addFirst(Student student) {
		// Add your implementation here
	}

	
	public void addLast(Student student) {
		// Add your implementation here
	}

	
	public void add(Student student, int index) {
		// Add your implementation here
	}

	
	public void remove(int index) {
		// Add your implementation here
	}

	
	public void remove(Student student) {
		// Add your implementation here
	}

	
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	
	public void bubbleSort() {
		// Add your implementation here
	}

	
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	
	
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
