package entity;

public class Zoo {
	Animal [] animals;
	 String name;
	 String city;
	final int nbrCages=3;
	 int nbrAnimals;
	public Zoo() {
		super();
		animals =new Animal[nbrCages];
		this.name = name;
		this.city = city;
		
	}
	public boolean isZoofull() {
		if(nbrAnimals>nbrCages)
			return true;
		else
			return false;
	}
	public Zoo compare(Zoo z1,Zoo z2) {
		if(z1.nbrAnimals>z2.nbrAnimals)
			return z1;
		else
			return z2;
	}

	public Animal[] getAnimals() {
		return animals;
	}
	public int searchanimals(Animal animale) {
		int s=0;
		for(int i=0;i<nbrCages;i++) {
		if(animale.name==animals[i].name) {
			s++;
		}	
		}
		return s;
	}
		public void addanimal(Animal animale) throws ZooFullException {	
			if(nbrCages>nbrAnimals) {
		animals[nbrAnimals]=animale;
		nbrAnimals++;}
			else {
				 throw new ZooFullException("Zoo is full. Cannot add more animals");
			}
		
		}
		   boolean removeAnimal(Animal animale) {
		        int indexAnimal = searchanimals(animale);
		        if (indexAnimal == -1)
		            return false;
		        for (int i = indexAnimal; i < nbrAnimals; i++) {
		            animals[i] = animals[i + 1];
		            animals[nbrAnimals] = null;
		            this.nbrAnimals--;
		        }
		        return true;
		    }
		   public void displayanimals() {
			   for(int i=0;i<nbrAnimals;i++) {
				   System.out.println(animals[i]);
			   }
		   }
	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getNbrCages() {
		return nbrCages;
	}


}
