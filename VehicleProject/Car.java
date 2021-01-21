public class Car extends Vehicle //General class for all cars. Also inherits the fields, constructors, and methods from the Vehicle class (the "extends Vehicle" is responsible for this).
{

	private String modelType; //String variable so it'll store a word/phrase having to do with the car's model type 
	private boolean isStickGear; //boolean variable so it'll store a true/false having to do with whether or not the car is stick gear
	private double milage; //double variable so it'll store a number that can have long decimals having to do with the milage of the car 
	private double price; //double variable so it'll store a number that can have long decimals having to do with the price of the car 
	
	public Car() //Creates a default constructor for the Car class 
	{
		super(); //Calls the default constructor of the Vehicle class 
	    modelType = "Toyota Camry"; 
	    isStickGear = false;
		this.milage = 30;
		this.price = 50000;
	}
	
	public Car(String color, int year, double milage, double price, String modelType, boolean isStickGear) //Creates a constructor that has a bunch of parameters 
	{
		super(color, year); //Calls the other constructor of the Vehicle class 
		this.milage = milage; 
		this.price = price;
		this.modelType = modelType;
		this.isStickGear = isStickGear;
	}
	
	public void printDetails() // This is a method to print all the details of a vehicle generally has, and the details of the car
	{
		super.print(); //cals the print method in the Vehicle class 
		System.out.println("The model type is a: " + modelType);
		System.out.println("The milage is: " + milage);
		System.out.println("The price of the car is: " + price);
		if(isStickGear)
		{
			System.out.println("The car has a stick gear. sad.");
		}
		else
		{
			System.out.println("The car has a automatic gear. yay!");
		}
	}
	
	
}
