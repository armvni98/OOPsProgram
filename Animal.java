public class Animal implements Eater {
	
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	

	private int caloriesConsumed = 0;
	private int caloriesAccumulator = 0;
	private double height;

	public Animal() {
		name = "";
		birthYear = 1900;
		weight = 0.0;
		height = 0.0;
		gender = 'u';
	}

	public Animal(String name, int birthY, double wei, char gen) {
		this.name = name;
		birthYear = birthY;
		if (wei < -1) {
			weight = -1;
		} else {
			weight = wei;
		}
		if (gen == 'm' || gen == 'f') {
			gender = gen;
		} else
			gender = 'u';

	}

	public Animal(String name, int birthY, double wei, double height, char gen) {
		this.name = name;
		birthYear = birthY;
		if (wei < -1) {
			weight = -1;
		} else {
			weight = wei;
		}
		if (height < 0) {
			this.height = -1;
		} else {
			this.height = height;
		}
		if (gen == 'm' || gen == 'f') {
			gender = gen;
		} else
			gender = 'u';
	}

	public String getName() {
		return name;
	}

	public void setName(String nam) {
		name = nam;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int year) {
		birthYear = year;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double w) {
		if (w < 0) {
			weight = -1.0;
		} else
			weight = w;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		if (h < 0) {
			height = -1.0;
		} else {
			height = h;
		}
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char g) {
		if (g == 'm' || g == 'f') {
			gender = g;
		} else
			gender = 'u';
	}

	public int calculateAge(int currentYear) {
		if (currentYear < birthYear) {
			return -1;
		}
		return currentYear - birthYear;
	}

	public boolean isMale() {
		if (gender == 'm') {
			return true;
		} else
			return false;
	}

	public boolean isFemale() {
		if (gender == 'f') {
			return true;
		} else
			return false;
	}

	public double calculateBMI() {
		double total = 0;

		total = weight / Math.pow(height, 2) * 703;

		return total;
	}

	public void printDetails() {
		System.out.printf("Name: %20s | Year of Birth: %4d | " + "Weight: %10.2f | Height: %10.2f | Gender: %c\n", name,
				birthYear, weight, height, gender);

	}

	public void gainWeight() {
		weight++;
		if (weight < 0) {
			weight = 0;
		}
	}

	public void gainWeight(double g) {
		weight += g;
		if (weight < 0) {
			weight = 0;
		}
	}

	public void loseWeight() {
		weight--;
		if (weight < 0) {
			weight = 0;
		}
	}

	public void loseWeight(double l) {
		weight -= l;
		if (weight < 0) {
			weight = 0;
		}
	}

	@Override
	public String toString() {
		String s = String.format(
				"Name: %20s | Year of Birth: %4d | " + "Weight: %10.2f | Height: %10.2f | Gender: %c\n", name,
				birthYear, weight, height, gender);
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal otherAnimal = (Animal) obj;
			if (this.name == otherAnimal.name) {
				if (this.birthYear == otherAnimal.birthYear) {
					if (this.gender == otherAnimal.gender) {
						if (this.weight == otherAnimal.weight) {
							if (this.height == otherAnimal.height) {
								return true;
							}
						}
					}
				}
			}

		}
		return false;
	}

	public void eat(Food food) {
		caloriesAccumulator += food.getCalories();
		caloriesConsumed += food.getCalories();
	}

	public void eat(Food[] a) {
		for (int i = 0; i < a.length; i++) {
			caloriesAccumulator += a[i].getCalories();
			caloriesConsumed += a[i].getCalories();
		}
	}

	public int getCaloriesAccumulator() {
		return caloriesAccumulator;
	}

	public int getCaloriesConsumed() {
		return caloriesConsumed;
	}

	public double metabolizeAccumulatedCalories() {
		return caloriesConsumed;
	}

	public void setCaloriesAccumulator(int setCal) {
		caloriesAccumulator = setCal;
	}

	public void setCaloriesConsumed(int setCal) {
		caloriesConsumed = setCal;
	}

}