public class Vehicle //This is general class that'll apply to all vehicles
{
	private String color; //String variable so it'll store a word/phrase having to do with the car's model type
	private int year; //int variable so it'll store a whole number having to do with year

	
	public Vehicle() //Creates a default constructor for the Vehicle class 
	{
		this.color = "blue"; //Sets the color to "blue" if default constructor is used
		this.year = 2018; //Sets the year to 2018 if default constructor is used 

	}
	
	public Vehicle(String color, int year) //Creates a constructor that has two parameters which are color and year  
	{
		this.color = color; //Sets the Vehicles color to the inputted one by the user (the "this" is what differentiates the two btw)
		this.year = year; //Sets the Vehicles color to the inputted one by the user (the "this" is what differentiates the two btw)
		
	}
	
	public String getColor() //This is a method to get the color of the Vehicle (we have to do this because color is private in the class)
	{
		return color;
	}
	
	public int getYear()// This is a method to get the year of the Vehicle (we have to do this because year is private in the class)
	{
		return year; 
	}
	
	public void print()// This is a method to print all the details of a vehicle generally has
	{
	  	System.out.println("The Vehicle details are: ");
		System.out.println("The color of the Vehicle is: " + color);
	  	System.out.println("The Vehicle was made in: " + year);
	}
}
