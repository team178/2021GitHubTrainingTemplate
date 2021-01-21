public class Main {

	public static void main(String[] args)
	{ 
		//Vehicle Object
		Vehicle vehicle = new Vehicle();
		vehicle.print();
    	System.out.println("***********************************");
		
		//Toyota Object but called the print method from car class, not the print method in Toyota class
		Car toyotaCar = new Car();
    	System.out.println("The car details are from Car Class.");
		toyotaCar.print();
		System.out.println("***********************************");

		//Toyota Object with Print method from Toyota Class
		Car toyotaCar2 = new Car();
		toyotaCar2.printDetails();
		System.out.println("***********************************");

		//Create Toyota Object with parameters
		Car toyotaCar3 = new Car("Silver",2005, 22.7, 56800, "Sedan", true);
		toyotaCar3.printDetails();
		System.out.println("***********************************");

		//Use the space below to create code to test your Truck class and Motorcycle class


	}

}
