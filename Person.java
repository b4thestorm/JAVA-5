public abstract class Person extends Passenger {
	private int numOffspring;
	
	public Person () {
		this.numOffspring = 0;
	}
	
	public Person (int numOffspring) {
		this();
		this.numOffspring = numOffspring;
	}
	
	public Person (String name, int birthYear,  double weight, double height, char gender, int numCarryOn, int numOffspring) {
		super(name, birthYear, weight, height, gender, numCarryOn);
		if (numOffspring > 0) {
			this.numOffspring = numOffspring;
		} else {
			this.numOffspring = 0;
		}
	}
	
	public void setNumOffspring (int numOffspring) {
		if (numOffspring > 0) {
			this.numOffspring = numOffspring;
		} else {
			this.numOffspring = 0;
		}
	}
	
	public int getNumOffspring() {
		return this.numOffspring;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Person: Number of Offspring: %4d\n", this.getNumOffspring());
	}
	
	@Override
	public boolean equals(Object obj) {
		//#call super equals
		if (super.equals(obj)) {
			return true;
		}
		//#check if the object is not an instance of the current instance object
		if (!(obj instanceof Person)) {
			return false;
		}
		//#check for your specific attributes
		Person personObj = (Person) obj;
		return (personObj.numOffspring == this.numOffspring); 	
	}
	
	// Weight gain is calculated based on the number of accumulated calories
	@Override
	public double metabolizeAccumulatedCalories() {
		double weightGain = this.getCaloriesAccumulator() / 1200.00;
		this.setWeight(weightGain);
		this.setCaloriesAccumulator(0);
		
		return weightGain; 
	}
	
	public static void main(String[] args) {
		System.out.println("Hello moto");

	}

}
