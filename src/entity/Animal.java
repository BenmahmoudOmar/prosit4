package entity;


public class Animal implements Omnivore<String> {
	String family;
	String name;
	int age;
	boolean isMammal;

	public Animal(String family, String name, int age, boolean isMammal) throws AgeException {
		super();
		this.family = family;
		this.name = name;
		if(age<0) {
			throw new AgeException("age invalide");
		}
		else
		{
		this.age = age;
		}
		this.isMammal = isMammal;
	}
	
    public void eatMeat(String meat) {
        System.out.println("Eating meat: " + meat);
    }

    @Override
    public void eatPlant(String plant) {
        System.out.println("Eating plant: " + plant);
    }

    @Override
    public void eatPlantAndMeat(String food) {
        System.out.println("Eating plant and meat: " + food);
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
