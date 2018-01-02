
public class Machine {
	
	protected String name = "Machine Type 1"; //can only be accessed in Machine class because it was made private.. making it protected for package access in Car

	public void Start(){
		
		System.out.println("Machine started!");
		
	}
	
public void Stop(){
		
		System.out.println("Machine stopped!");
		
	}
	
}
