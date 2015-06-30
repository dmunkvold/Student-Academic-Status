
public abstract class NonRegular extends EnrolledStudent{
	
	/*
	 * this class represents students who have graduated already or are in high school.
	 * all of the fields of the enrolledstudent superclass apply, and no new fields
	 * need to be declared here.
	 */
	
	public NonRegular(String firstName, String lastName, double currentEnrolledCredits, double totalCredits){
		super (firstName, lastName, currentEnrolledCredits, totalCredits);
	}
	
	
	/*
	 * two of the methods here, getclassstanding and makinggoodprogress throw
	 * exceptions that will be dealt with later because the graduation requirements
	 * and class standing don't apply to these kinds of students. Nonregular students
	 * can take up to 4 credits, so the validregistration method checks to see 
	 * if this is the case and returns either true or false. 
	 */
	
	
	public String getClassStanding() throws Exception{
		throw new Exception();
	}
	
	public boolean makingGoodProgress() throws Exception{
		throw new Exception();
	}
	
	public boolean validRegistration(){
		if (currentEnrolledCredits > 0 && currentEnrolledCredits<=4){
			return true;
		} else {
			return false;
		}
	}
}

/*
 * code written by 
 * David Munkvold
 * 6/30/15
 */


