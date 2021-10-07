public class Dog extends Mammal implements Speaker {
	public class DogToy {
		private String dogToyName;
		private int dogToyRating;

		public DogToy(String name, int rating) {
			dogToyName = name;
			dogToyRating = rating;
		}

		public String toString() {
			String str = super.toString();
			str += String.format("DogToy: Toy Name: %20s | Rating %4d\n", dogToyName, dogToyRating);

			return str;
		}

	}

	private final String SPEAK_ANIMAL = "woof";
	private final int CALORIES_ANIMAL = 2000;

	private DogToy[] toys;
	private int numDogToys;

	public Dog() {
		toys = new DogToy[10];
		numDogToys = 0;
	}

	public Dog(double tailLength, int numLegs) {
		super(tailLength, numLegs);
		toys = new DogToy[10];
		numDogToys = 0;

	}

	public Dog(String name, int birthYear, double weight, double height, char gender, double tailLength, int numLegs) {
		super(name, birthYear, weight, height, gender, tailLength, numLegs);
		toys = new DogToy[10];
		numDogToys = 0;

	}

	public void addDogToy(String name, int rating)
	{
		if (numDogToys < toys.length) {
			toys[numDogToys++] = new DogToy(name, rating);
		} else {
			System.out.println("toys has reached capacity of 10");
		}
	}

	public String getDogToyAsString(int a)
	{
		if (a > -1 && a < numDogToys) {
			return toys[a].toString();
		}

		String str = "invalid index " + a;
		return str;

	}

	public int getNumDogToys() {
		return numDogToys;
	}

	public String getDogToyName(int a)
	{
		if (a >= 0 && a < numDogToys) {
			return toys[a].dogToyName;

		}
		String str = "invalid index " + a;
		return str;
	}

	public int getDogToyRating(int a)
	{
		if (a >= 0 && a < numDogToys) {
			return toys[a].dogToyRating;

		}
		return -1;
	}

	public int getHighestDogToyRating() {

		int maxRating = 0;
		for (int i = 0; i < numDogToys; i++) {
			if (maxRating < toys[i].dogToyRating) {
				maxRating = toys[i].dogToyRating;
			}
		}

		return maxRating;
	}

	@Override
	public void printDetails() {
		super.printDetails();
		System.out.printf("Dog: Number of Toys: %4d | Dog Toys:\n", getNumDogToys());
	}

	@Override
	public String toString() {

		String str = super.toString();
		str += String.format("Dog: Number of Toys: %4d | Dog Toys:\n", getNumDogToys());

		return str;

	}

	public double metabolizeAccumulatedCalories() {
		double cal = 0.0;

		cal = super.getCaloriesAccumulator() / CALORIES_ANIMAL;

		super.setWeight(getWeight() + cal);
		super.setCaloriesAccumulator(0);
		return cal;
	}

	@Override
	public String speak() {
		return SPEAK_ANIMAL;
	}
	
	public String speak(int a) {

		if (a <= 0) {
			return "";
		} else {
			String nStr = "";
			for (int i = 0; i < a; i++) {

				if (i == a - 1) {
					nStr += SPEAK_ANIMAL;
				} else {
					nStr += SPEAK_ANIMAL + " ";
				}
			}

			return nStr;
		}

	}

}