package entity;
public class Aquatic extends Animal implements Carnivore<String>{
	String habitat;
	public Aquatic(String family, String name, int age, boolean isMammal,String habitat) throws AgeException {
		super(name, name, age,isMammal);
		this.habitat=habitat;
		
	}
	public Aquatic() throws AgeException {
		super(null, null, 0, false);
	}
	public enum Food {
	    MEAT,
	    PLANT,
	    BOTH
	}

    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Aquatic animal eating meat.");
        } else {
            System.out.println("Aquatic animal cannot eat this type of food.");
        }
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
