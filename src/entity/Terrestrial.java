package entity;

public class Terrestrial extends Animal implements Omnivore<String> {

	int nbrLegs;
	public Terrestrial(String family, String name, int age, boolean isMammal,int nbrLegs) throws AgeException {
		super(name, name, age, isMammal);
		this.nbrLegs=nbrLegs;
	}
	public Terrestrial() throws AgeException {
		super(null, null, 0, false);
	}
	public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial animal eating meat.");
        } else {
            System.out.println("Terrestrial animal cannot eat this type of food.");
        }}
	public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Terrestrial animal eating plants.");
        } else {
            System.out.println("Terrestrial animal cannot eat this type of food.");
        }
    }
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Terrestrial animal eating both plants and meat.");
        } else {
            System.out.println("Terrestrial animal cannot eat this type of food.");
        }
    }
	public int getNbrLegs() {
		return nbrLegs;
	}
	public void setNbrLegs(int nbrLegs) {
		this.nbrLegs = nbrLegs;
	}
	@Override
	public String toString() {
		return "Terrestrial [nbrLegs=" + nbrLegs + ", family=" + family + ", name=" + name + ", age=" + age
				+ ", isMammal=" + isMammal + "]";
	}

}
