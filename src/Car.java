
public class Car extends Machine{
	
//public void Start(){
//		
//		System.out.println("Car started!");
//		
//	}
	
	@Override //override/implement shortcut auto-generated method
	public void Start() {
		
		System.out.println("Car started");
		
	}
	
	public void wipeWindShield(){
		
		System.out.println("Wiping windshield!");
		
	}
	
	public void showInfo(){
		
		System.out.println("Car name: " + name);
		
	}

}