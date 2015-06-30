
public class Employee extends Regular{

	/*
	 * this class is for employees of the school who are taking classes.
	 * they can only be enrolled in up to 4 credits at a time but otherwise the 
	 * fields of its superclasses apply.
	 * 
	 */
	public Employee(String fName, String lName, double curEnCredits,
			double totCredits, double humCred, double ssCred,
			double sciCred, double genCred, String maj){
		super(fName, lName, curEnCredits, totCredits, 
				humCred, ssCred, sciCred,
				genCred, maj);
	}
	
	
	/*
	 *  the methods that are implemented are student category and valid registration,
	 *  which checks to see if the employee is taking less than 4 credits. class standing
	 *  and making good progress dont apply to this class, because employees do not have
	 *  a class standing and are not subject to the same graduation requirements. 
	 *  in these cases the methods throw excpetions that will be dealt with in the 
	 *  registrar class.
	 */
	
	
	public String getClassStanding() throws Exception{
		throw new Exception();
	}
	
	public boolean makingGoodProgress() throws Exception{
		throw new Exception();
	}

	public String getStudentCategory(){
		return "Employee";
	}

	public boolean validRegistration(){
		if (currentEnrolledCredits>0 && currentEnrolledCredits<=4){
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


