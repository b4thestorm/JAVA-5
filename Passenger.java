import java.lang.Exception;

public abstract class Passenger implements Eater {
	private double height;
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	private int  numCarryOn;
	private int caloriesConsumed = 0;
	private int caloriesAccumulator = 0;
	
	public Passenger () {
		name = "";
		birthYear = 1900;
		weight = 0.0;
		gender = 'u';
		numCarryOn = 0;
	}
	
	public Passenger (String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
		this.name = name; 
		this.birthYear = birthYear;
		this.weight = weight;
		this.gender = gender;
		this.numCarryOn = numCarryOn;
		
		if (weight < 0) {
			this.weight  = -1;
		}
		
		if (numCarryOn < 0) {
			 this.numCarryOn = 0;
		}
		
		if (numCarryOn >= 2) {
			 this.numCarryOn = 2;
		}
		if (height  > 0) {
			this.height = height;
		} else {
			this.height = -1.0;
		}
		
		if (gender == 'm' ) { 
			this.gender = gender;
		} else if (gender == 'f') {
			this.gender = gender;
		} else {
			this.gender = 'u';
		}
	}
	
	
	public int calculateAge (int currentYear) {
		if (currentYear < birthYear) {
			return -1;
		}
		return currentYear - birthYear;
	}
	
	public void gainWeight () {
		weight = weight + 1;
	}
	
	public void gainWeight (double weight) {
		if (weight > 0) {
			this.weight += weight;
		} 	
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getBirthYear () {
		return birthYear;
	}
	
	public char getGender () {
		return gender;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight () {
		return weight;
	}
	
	public int getNumCarryOn () {
		return numCarryOn;
	}
	
	public boolean isFemale () {
		if (gender == 'f') {
			return true;
		} 	
		return false;
	}

	public boolean isMale () {
		if (gender == 'm') {
			return true;
		}
		return false;
	}
	
	public void loseWeight () {
		this.weight -= 1;
		
		if (weight < 0) {
			this.weight = 0;
		}
	}
	
	public void loseWeight (double weight){
		if (this.weight - weight < 0) {
			
		} else {
			this.weight -= weight;
		} 
	}
	
	public void printDetails() {
		System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c | NumCarryOn: %2d\n", 
				name, birthYear, weight, gender, numCarryOn );
	}
	
	public void setGender (char gender) {
		if (gender == 'm') { 
			this.gender = gender;
		} else if (gender == 'f') {
			this.gender = gender;
		} else {
			this.gender = 'u';
		}
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setBirthYear (int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void setWeight (double weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			this.weight = -1;
		}
	}
	
	public void setNumCarryOn (int newNumCarryOn) {
		 if (newNumCarryOn < 0) {
			 numCarryOn = 0;
		 }
		 if (newNumCarryOn >= 2) {
			 numCarryOn = 2;
		 }
	}
	
	public void setHeight(double height) {
		if (height < 0) {
			this.height = -1;
		} else {
			this.height = height;
		}
	}

	public double calculateBMI() {
		//using pounds and inches BMI = ( weight * 703) / (height2) 
		return (this.weight * 703) / Math.pow(this.height, 2);
	}
	
	
	
	public boolean isEquals(Object obj) {
		if (super.equals(obj)) {
			return true;
		} 
		if (!(obj instanceof Passenger) ) {
				return false;
		} 
		//convert object from Object to Passenger 
		Passenger passengerObj = (Passenger) obj;
		return name.equals(passengerObj.name) &&
	            birthYear == passengerObj.birthYear &&
	            weight == passengerObj.weight &&
	            height == passengerObj.height &&
	            gender == passengerObj.gender &&
	            numCarryOn == passengerObj.numCarryOn;
	}
	
	
	@Override
	public String toString() {
		return String.format("Name: %20s | Year of Birth: %d | Weight:     %.2f | Height:      %.2f | Gender: %c | NumCarryOn:  %d", this.name, this.birthYear, this.weight, this.height, this.gender, this.numCarryOn);
	}
	
	public int getCaloriesConsumed () {
		return this.caloriesConsumed;
	}
	
	public void setCaloriesConsumed (int calories) {
		if (calories >= 0) {
			this.caloriesConsumed += calories;
		} else {
			System.out.println("Error: cannot accumulate negative amount of calories.");
		}
	}
	
	public int getCaloriesAccumulator () {
		return this.caloriesAccumulator;
	}
	
	public void setCaloriesAccumulator (int calories) {
		if (calories >= 0) {
			this.caloriesAccumulator += calories;
		} else {
			System.out.println("Error: cannot accumulate negative amount of calories.");
		}
	}
	
	public void zeroCalories () {
		this.caloriesAccumulator = 0;
	}
	
	public abstract double metabolizeAccumulatedCalories();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}