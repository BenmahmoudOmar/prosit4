package tn.esprit.gestionzoo.main;
import entity.AgeException;
import entity.ZooFullException;
import entity.Animal;
import entity.Aquatic;
import entity.Food;
import entity.Terrestrial;
import entity.Zoo;

import java.util.Scanner;

public class ZooManagement {
    static int nbrCages, agean = 0;
    static String namez = "";

    public static void main(String args[]) throws AgeException, ZooFullException {
        Scanner sc = new Scanner(System.in);
        while (namez.isEmpty() || nbrCages <= 0) {
            System.out.println("Enter the name of your zoo: ");
            namez = sc.nextLine();}
        
        while (agean <= 0) {
            System.out.println("Enter the age of your animal: ");
            agean = sc.nextInt();
        }

        Animal lion = new Animal("alex", "Lion", agean, true);
        Animal[] zooan = {lion};
        Zoo myZoo = new Zoo();
        myZoo.setName("Zoo1");
        myZoo.setCity("Tunisia");
        Animal zebra = null;
		try {
			zebra = new Animal("zee", "Zebra", 7, true);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        myZoo.addanimal(zebra);

        System.out.println("Animal:");
        System.out.println("Family: " + lion.getFamily());
        System.out.println("Name: " + lion.getName());
        System.out.println("Age: " + lion.getAge());
        System.out.println("Is a mammal: " + lion.isMammal());
        System.out.println("\nZoo:");
        System.out.println("Zoo Name: " + myZoo.getName());
        System.out.println("City: " + myZoo.getCity());
        System.out.println("Number of Cages: " + myZoo.getNbrCages());
        myZoo.displayanimals();
        Aquatic shark = new Aquatic();
        shark.eatMeat(Food.MEAT);
        Terrestrial bear = new Terrestrial();
        bear.eatMeat(Food.MEAT);
        bear.eatPlant(Food.PLANT); 
        bear.eatPlantAndMeat(Food.BOTH);
    }
}
