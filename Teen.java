public class Teen extends Person implements Mover{

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
	
	public double metabolizeAccumulatedCalories() {
		double weightGain = this.getCaloriesAccumulator() / 5000.00;
		this.gainWeight(weightGain);
		this.zeroCalories();
		return weightGain; 
	}

	@Override
	public String move() {
		return String.format("run fast and jump");
	}

	@Override
	public String move(int count) {
		StringBuilder sb = new StringBuilder();
		while (count > 0) {
//			if (count > 0) {
//				sb.append("run fast and jump\n");
//			} else {
			if (count == 1) {
				sb.append("run fast and jump");
			}  else {
				sb.append("run fast and jump\n");
			}
				
//			}
			count = count - 1; 
		}
		return sb.toString(); 
	}
}
