package startprogram;

public class BKabstract {
	public static void main(String[] args) {
		DogAnimal animal = new DogAnimal();
		System.out.println(animal.getLegCount());

		MonkeyAnimal animal1 = new MonkeyAnimal();
		System.out.println(animal.getLegCount());
	}
}

abstract class Animal {
	int leg;
	String type = "white";

	public abstract int getLegCount();

	void main() {
		System.out.println("about animals");
	}
}

interface IAnimal {
	int getLegCount();

	String getType();

}

class DogAnimal extends Animal implements IAnimal {

	@Override
	public int getLegCount() {
		main();
		return 4;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

}

class MonkeyAnimal extends Animal {

	@Override
	public int getLegCount() {
		return 2;
	}

}