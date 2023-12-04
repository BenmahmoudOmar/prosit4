package entity;

public class Terrestrial extends Animal{

	int nbrLegs;
	public Terrestrial(String family, String name, int age, boolean isMammal,int nbrLegs) throws AgeException {
		super(name, name, age, isMammal);
		this.nbrLegs=nbrLegs;
	}
	public Terrestrial() throws AgeException {
		super(null, null, 0, false);
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
