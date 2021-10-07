public abstract class Mammal extends Animal implements Eater {
	private double tailLength;
	private int numLegs;
	
	public Mammal() {
		super();
		tailLength = 0.0;
		numLegs = 0;
	}
	public Mammal(double tailLength, int numLegs ) {
		super();
		this.tailLength = tailLength;
		this.numLegs = numLegs ;
	}
	public Mammal (String name, int birthYear, double weight, double height, char gender, double tailLength, int numLegs) {
		super(name,birthYear,weight,height,gender );
		
		this.tailLength = tailLength;
		this.numLegs = numLegs ;
	}
	
	@Override
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mammal other = (Mammal) obj;
		if (numLegs != other.numLegs)
			return false;
		if (Double.doubleToLongBits(tailLength) != Double.doubleToLongBits(other.tailLength))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Mammal: Tail Length: %10.2f | Number of Legs: %4d\n", tailLength, numLegs);
	
	
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		
		System.out.printf("Mammal: Tail Length: %10.2f | Number of Legs: %4d\n", tailLength, numLegs);
	}
	
	
	
	
	public double getTailLength() {
		if (tailLength >=0 ) {
		return tailLength;
		}
		else {
			return -1;
	}
	}
	public void setTailLength(double tailLength) {
		this.tailLength = tailLength;
	}
	public int getNumLegs() {
		if (numLegs >=0 ) {
		return numLegs;
		}
		else {
			return -1;
	}
	}
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	
	}
