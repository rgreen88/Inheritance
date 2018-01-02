
public class Inheritance {

	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		
		mach1.Start();
		mach1.Stop();
		
		Car car1 = new Car();
		
		car1.Start(); //inheritance from Machine class--- duplicate method in Car overrides the method inside Machine class
		car1.wipeWindShield();
		car1.showInfo(); //another example of inheritance.  Can't inherit private or protected variables
		car1.Stop(); //Inheritance from Machine class
		
		//Can't inherit String

	}

}

