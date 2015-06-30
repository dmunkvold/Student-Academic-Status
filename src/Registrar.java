import java.util.ArrayList;


public class Registrar {
	
	/*
	 * this class is for storing student information, as the registrar does at 
	 * Macalester. I have an arraylist of enrolled student objects that can be used 
	 * to look up student information.
	 */
	
	
	static ArrayList<EnrolledStudent> studList = new ArrayList<EnrolledStudent>();

	public static void main(String[]args){
		
		/*
		 * in this method I create four made up students of various categories
		 * and characteristics to store in the list, and then I print all the 
		 * students and their information. In the instance that the get method doesnt
		 * apply, it throws an exception that moves on to the next student, and its in 
		 * such an order that all information about a student is printed. 
		 */
		
		
		Special specstud = new Special("Jack", "Johnson", 4, 4);
		studList.add(specstud);
		Alum alumni = new Alum("International Studies", "Janice", "Dickson", 0, 124);
		studList.add(alumni);
		Regular regstud1 = new Regular("David", "Munkvold", 16, 60, 10,10,10,30, "Neuroscience");
		studList.add(regstud1);
		Regular regstud2 = new Regular("Leah", "Myers", 0, 94, 6,12,16,50, "American Studies");
		studList.add(regstud2);
		Employee empstud = new Employee("Fred", "Fredson", 5, 20, 5,5,5,5, "Music");
		studList.add(empstud);
		for (int i =0 ; i<studList.size(); i++){
			try{
			System.out.println("First Name: " + studList.get(i).getFirstName());
			System.out.println("Last Name: " + studList.get(i).getLastName());
			System.out.println("Current Enrolled Credits: " + studList.get(i).getCurrentEnrolledCredits());
			System.out.println("Total Credits Earned: " + studList.get(i).getTotalCredits());
			System.out.println("Student Category: "+ studList.get(i).getStudentCategory());
			System.out.println("Valid Registration? "+ studList.get(i).validRegistration());
			System.out.println("Major: "+ studList.get(i).getMajor());
			System.out.println("Class Standing: "+ studList.get(i).getClassStanding());
			System.out.println("Making good progress? "+ studList.get(i).makingGoodProgress());
			System.out.println("\n");
			} catch (Exception e){
				System.out.println("\n");
				continue;
			}
			finally{
			}
		}
	}
}

/*
 * code written by
 * David Munkvold
 * 6/30/15
 */


