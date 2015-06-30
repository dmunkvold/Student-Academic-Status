
public abstract class EnrolledStudent {
	
	/*
	 * For this program, I am creating a system of storing student information. 
	 * I begin with this abstract class enrolled student, which contains fields
	 * shared by all types of students, a first name, last name, current credits 
	 * and total credits. I also declare (but do not implement) many methods for
	 * retrieving these and other fields.
	 * 
	 */
	
	
	public String firstName;
	public String lastName;
	public double currentEnrolledCredits;
	public double totalCredits;
	
	public EnrolledStudent(String fName, String lName, double curEnCredits, double totCredits){
		firstName = fName;
		lastName = lName;
		currentEnrolledCredits = curEnCredits;
		totalCredits = totCredits;
		
	}
	
	/*
	 * the methods that I implement for this class are to get and set the fields
	 */

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String fName) {
		firstName = fName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lName) {
		lastName = lName;
	}

	public double getCurrentEnrolledCredits() {
		return currentEnrolledCredits;
	}

	public void setCurrentEnrolledCredits(double currEnCredits) {
		currentEnrolledCredits = currEnCredits;
	}

	public double getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(double totCredits) {
		totalCredits = totCredits;
	}
	
	/*
	 * The following abstract methods are used to get fields that are not within
	 * this class, as well as methods that determine if the student is making good 
	 * progress with requirements/have valid registration. I cannot implement any of 
	 * these methods because this class cannot be instantiated, so all of them are to
	 * be called later by subclasses
	 */
	
	public abstract String getStudentCategory();
	
	public abstract String getClassStanding() throws Exception;
	
	public abstract boolean makingGoodProgress() throws Exception;
	
	public abstract boolean validRegistration();
	
	public abstract String getMajor() throws Exception;
}

/*
 * code written by
 * David Munkvold
 * 6/30/15
 */
