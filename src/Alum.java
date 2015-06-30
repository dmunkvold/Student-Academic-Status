
public class Alum extends NonRegular{
	
	/*
	 * in this class, representing an alumn, the only relevant information is 
	 * their name, the total number of credits they earned, if they are currently
	 * taking any classes (fields of EnrolledStudent), and their major.
	 */
	
	
	static String major;
	
	public Alum(String maj, String fName, String lName, double curEnCredits, double totCred){
		super (fName, lName, curEnCredits, totCred);
		major = maj;
	}
	
	public String getStudentCategory(){
		return "Alum";
	}
	
	public String getMajor(){
		return major;
	}
	
}

/*
code written by 
David Munkvold
6/30/15
*/

