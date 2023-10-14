package tn.esprit.gestionzoo.main;
import entity.Animal;
import entity.Aquatic;
import entity.Dolphin;
import entity.Penguin;
import entity.Terrestrial;
import entity.Zoo;
import java.util.Scanner;

public class ZooManagement {
    static int nbrCages, agean = 0;
    static String namez = "";

    public static void main(String args[]) {
    	/* Scanner sc = new Scanner(System.in);
        while (namez=="" ) {
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
        Animal zebra = new Animal("zee", "Zebra", 7, true);
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
        myZoo.displayanimals();*/
        Terrestrial horse=new Terrestrial("horses","grace",4,true,4);
        Dolphin dolphin=new Dolphin("swimmers","patrick",5,true,"sea",10.0f);
        Penguin penguin=new Penguin("swimmers","runner",5,true,"ocean",30.0f);
        System.out.println("1er animal "+ horse.toString()+"\n");
        System.out.println("2em animal "+ dolphin.toString()+"\n");
        System.out.println("3em animal "+ penguin.toString()+"\n");
        dolphin.swim();
        penguin.swim();
    }
}
