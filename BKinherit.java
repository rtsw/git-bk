package startprogram;

public class BKinherit extends child {
	public static void main(String[] args) {
		child cl = new child();
		cl.name = "swathi";
		// cl.type = 'g';
		cl.number = 111;
		cl.main();
	}
}

class child {
	String name;
	private char type;
	protected int number;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private void setType(char type) {
		this.type = type;
	}

	public char getType() {
		return type;
	}

	protected void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void main() {
		System.out.println("this is a child class");
		System.out.println("name:" + name);
		System.out.println("type:" + type);
		System.out.println("number:" + number);
	}
}