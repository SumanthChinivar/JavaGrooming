package oops;

public class Bike {
	String name="Himalayan";
	
	{
		float fuel=0.5f;
		System.out.println("Check fuel before starting the engine");
		if(fuel==0) {
			System.out.println("Please refuel");
		}
		else
			System.out.println("You can start your ride");
	}
	
	public static void main(String[] args) {
		Bike b1=new Bike();
		System.out.println("------------------");
		System.out.println("The name of the bike is:"+b1.name);
		Bike b2=new Bike();
		
	}
}
