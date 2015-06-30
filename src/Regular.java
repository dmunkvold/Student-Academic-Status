
public class Regular extends EnrolledStudent{
	
	/*
	 * this class represents regular students who are taking classes at the school
	 * and pursuing a major at said school. These students are subject to specific
	 * graduation requirements so the number of credits they have in each department
	 * matters, so they are declared here with the students major.
	 */
	
	
	public double humanitiesCredits;
	public double socialStudiesCredits;
	public double scienceCredits;
	public double generalCredits;
	public String major;
	
	public Regular(String fName, 
			String lName, 
			double curEnCredits, 
			double totCredits,
			double humCred,
			double ssCred,
			double sciCred,
			double genCred,
			String maj){
		super (fName, lName, curEnCredits, totCredits);
		humanitiesCredits = humCred;
		socialStudiesCredits = ssCred;
		scienceCredits = sciCred;
		generalCredits = genCred;
		major = maj;
	}

	
	/*
	 * here I implement setters for the credits in each department so that this 
	 * information can be updated as the students move through the system.
	 */
	
	
	public void setHumanitiesCredits(double humCred) {
		humanitiesCredits = humCred;
	}

	public void setSocialStudiesCredits(double ssCred) {
		socialStudiesCredits = ssCred;
	}

	public void setScienceCredits(double sciCred) {
		scienceCredits = sciCred;
	}

	public void setGeneralCredits(double genCred) {
		generalCredits = genCred;
	}

	public void setMajor(String maj) {
		major = maj;
	}
	
	
	/*
	 * this method checks the number of credits that the student has and is currently
	 * enrolled in and determines what year the student is in school.
	 */
	
	
	public String getClassStanding() throws Exception{ 
		if (currentEnrolledCredits+totalCredits >=0 && currentEnrolledCredits+totalCredits<28){
			return "First Year";
		}
		if (totalCredits+currentEnrolledCredits >= 28 && totalCredits+currentEnrolledCredits <60){
			return "Second Year";
		}
		if (totalCredits+currentEnrolledCredits >= 60 && totalCredits+currentEnrolledCredits <92){
			return "Third Year";
		}else {
			return "Fourth Year";
		}
	}
	
	public String getStudentCategory(){
		return "Regular";
	}
	
	
	/*
	 * this method checks to make sure that at least 10% of the students credits 
	 * are earned from each department. If not, this method will return false and
	 * the registrar can know that the student is not on track for graduation.
	 */
	
	
	public boolean makingGoodProgress() throws Exception{ 
		if (((currentEnrolledCredits+totalCredits)*.1) < humanitiesCredits &&
				((currentEnrolledCredits+totalCredits)*.1) < socialStudiesCredits &&
				((currentEnrolledCredits+totalCredits)*.1) < scienceCredits){
			return true;
		} else {
			return false;
		}
	}
	
	
	/*
	 * valid registration for a regular student is between 12 and 18 credits, so this method 
	 * checks the students current enrolled credits, returns true if the student 
	 * is between 12 and 18 and otherwise returns false.
	 */
	
	
	public boolean validRegistration(){
		if (currentEnrolledCredits >= 12 && currentEnrolledCredits<=18){
			return true;
		} else {
			return false;
		}
	}
	
	public String getMajor(){
		return major;
	}
	
	
	/*
	 *this method was used for testing purposes.
	 */
	
	
	public String toString(){
		
		return "First Name: " + firstName + "\n" +
		"Last Name: " + lastName + "\n";
		
	}
}

/*
 * code written by 
 * David Munkvold
 * 6/30/15
 */

