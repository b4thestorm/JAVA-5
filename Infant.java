public class Infant extends Person implements Mover{
  private InfantToy[] toys;
  private int numInfantToys;


  public class InfantToy {
      private String infantToyName;
      private int infantToyRating;

      public InfantToy(String name, int rating) {
          this.infantToyName = name;
          this.infantToyRating = rating;
      }

      public String toString() {
          return String.format("InfantToy: Toy Name: %20s | Rating %4d\n", this.infantToyName, this.infantToyRating);
      }

      public String getInfantToyName() {
          return this.infantToyName;
      }

      public int getInfantToyRating() {
          return this.infantToyRating;
      }
  }

  public Infant() {
      this.toys = new InfantToy[10];
      this.numInfantToys = 0;
  }

  public Infant(String name, int age, double weight, double height, char gender, int ssn) {
      super(name, age, weight, height, gender, ssn, 0);
      this.toys = new InfantToy[10];
      this.numInfantToys = 0;
  }
  
  public void addInfantToy(String name, int rating) {
	InfantToy toy =  new InfantToy(name, rating);
		
	if (numInfantToys < 10) {
		this.toys[numInfantToys] = toy;
		this.numInfantToys = this.numInfantToys + 1; 
	} else {
		System.out.print("toys has reached capacity of 10");
	}	
  }

  public String getInfantToyAsString(int index) {
      if (index >= 0 && index < this.numInfantToys) {
          return this.toys[index].toString();
      } else {
          return "invalid index " + index;
      }
  }

  public int getNumInfantToys() {
      return this.numInfantToys;
  }

  public String getInfantToyName(int index) {
      if (index >= 0 && index < this.numInfantToys) {
          return this.toys[index].getInfantToyName();
      } else {
          return "invalid index " + index;
      }
  }

  public int getInfantToyRating(int index) {
      if (index >= 0 && index < this.numInfantToys) {
          return this.toys[index].getInfantToyRating();
      } else {
          return -1;
      }
  }

  public int getHighestInfantToyRating() {
      int highestRating = 0;
      for (int i = 0; i < this.numInfantToys; i++) {
          if (this.toys[i].getInfantToyRating() > highestRating) {
              highestRating = this.toys[i].getInfantToyRating();
          }
      }
      return highestRating;
  }


@Override
public void eat(Food food) {
	this.setCaloriesAccumulator(food.getCalories());
	this.setCaloriesConsumed(food.getCalories());
}

@Override
public void eat(Food[] foods) {
	for (int i = 0; i < foods.length;  i++) {
		eat(foods[i]);
	}
}


@Override
public double metabolizeAccumulatedCalories() {
	double weightGain = this.getCaloriesAccumulator() / 1200.00;
	this.gainWeight(weightGain);
	this.zeroCalories();
	return weightGain; 
}


@Override
public String move() {
	return String.format("flail arms and legs");
}

@Override
public String move(int count) {
	// TODO Auto-generated method stub
	return null;
}

}
