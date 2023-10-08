package entity;


public class Animal {
	String family;
	String name;
	int age;
	boolean isMammal;

	public Animal(String family, String name, int age, boolean isMammal) {
		super();
		this.family = family;
		this.name = name;
		this.age = age;
		this.isMammal = isMammal;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMammal() {
		return isMammal;
	}

	public void setMammal(boolean isMammal) {
		this.isMammal = isMammal;
	}

	@Override
	public String toString() {
		return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
	}

	
}
