public class Elder  extends Person implements Mover{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	public String move() {
		return String.format("ouch my back wait for me");
	}

	@Override
	public String move(int count) {
		StringBuilder sb = new StringBuilder();
		while (count > 0) {
			if (count == 1) {
				sb.append("ouch my back wait for me");
			}  else {
				sb.append("ouch my back wait for me\n");
			}
				
			count = count - 1; 
		}
		return sb.toString(); 
	}
	
	@Override
	public double metabolizeAccumulatedCalories() {
		double weightGain = this.getCaloriesAccumulator() / 300.00;
		this.gainWeight(weightGain);
		this.zeroCalories();
		return weightGain; 
	}
	

}
