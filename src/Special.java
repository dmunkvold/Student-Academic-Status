
public class Special extends NonRegular{
	
	/* 
	 * this class is for high school students or retired people in the community who
	 * are taking classes. 
	 */
	
	
	public Special(String fName, String lName, double curEnCredits, double totCredits){
		super (fName, lName, curEnCredits, totCredits);
		}
	
	/*
	 * the methods implemented here give the student category and throw an exception 
	 * for the getmajor method, because these students are not pursuing a major
	 * at the school
	 */
	
	
	public String getStudentCategory(){
		return "Special";
	}
	
	public String getMajor() throws Exception{
		throw new Exception();
	}
}

/*
 * code written by
 * David Munkvold
 * 6/30/15
 */


