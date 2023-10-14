package entity;

public class Aquatic extends Animal{
	String habitat;
	public Aquatic(String family, String name, int age, boolean isMammal,String habitat) {
		super(name, name, age, isMammal);
		this.habitat=habitat;
		
	}
	public Aquatic() {
		super(null, null, 0, false);
	}


	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void swim() {
		System.out.println("animal is swimming");
	}



}
