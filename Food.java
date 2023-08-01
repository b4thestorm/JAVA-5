public class Food {
	private String name;
	private int calories;
	
	public Food (String name , int calories) {
		this.name = name;
		this.calories = calories;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCalories (int calories) {
		this.calories = calories;
	}
	
	public int getCalories () {
		return this.calories;
	}
	
	@Override
	public String toString () {
		return String.format("Food - name: %10s | calories: %4d", this.name, this.calories);
	}
	
	@Override
	public boolean equals (Object obj) {
		if (super.equals(obj)) {
			return true;
		}
		if (!(obj instanceof Food)) {
			return false;
		}
		Food foodObj = (Food) obj;
		return foodObj.name == this.name && foodObj.calories == this.calories;
	}
	
	public static void main(String[] args) {
		
		
	}

}

//In this assignment you will use the classes (Passenger, Person and Infant) from Homework 4.
//
//
//
//Homework 5-1	Textbook Section 10.7
//
//Create a class to represent a Food object. Use the description provided below in UML.
//
//Food
//name : String
//calories :  int
//
//Food(String, int)	// The only constructor. Food name and calories must be
//			// specified
//setName(String) : void	// Sets the name of the Food
//getName() : String		// Returns the name of the Food
//setCalories(int) : void 		// Sets the calories of the Food
//getCalories() : int		// Returns the calories of the Food
//toString() : String		@Override 	//see Note1:
//equals(Object) : boolean	@Override	//see Note2:
//
//NOTE1: 
//toString() method returns a String with the following format: 
//“Food - name: %10s | calories: %4d” 
//
//NOTE2: 
//Two instances of Food are equal if, and only if, their names are equal and their calories are equal.
