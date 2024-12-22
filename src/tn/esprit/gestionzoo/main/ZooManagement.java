package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    //prosit1
    int nbrCages = 20;
    String zooName = "myZoo";

    public static void main(String[] args) {

       ZooManagement z = new ZooManagement();
        System.out.println(z.zooName + " comporte " + z.nbrCages);





        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de cages :");
        int nbrCagesSaisie = sc.nextInt();
        ZooManagement z1 = new ZooManagement();
        z1.nbrCages = nbrCagesSaisie;

        z1.zooName = "MyZoo1";
        System.out.println(z1.zooName + " comporte " + z1.nbrCages);

        //prosit2

        Animal lion = new Animal();
        lion.name = "lion";
        lion.age = 5;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Belvedere";
        myZoo.city = "Tunis";

        myZoo.animals = new Animal[25];

        Animal lion1 = new Animal("cats", "lion1", 5, true);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(lion.toString());

        //prosit3
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(lion1));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(lion));
        Animal lion2 = new Animal("cats", "lion1", 5, true);
        System.out.println(myZoo.searchAnimal(lion1));


        System.out.println(myZoo.removeAnimal(lion2));
        myZoo.displayAnimals();

        Zoo myZoo2 = new Zoo("zoo","benarous");
        myZoo2.displayZoo();
        System.out.println(myZoo2.addAnimal(lion));
        System.out.println(myZoo2.addAnimal(lion1));
        myZoo2.displayAnimals();
        System.out.println(myZoo2.isZooFull());
        System.out.println(myZoo.comparerZoo(myZoo,myZoo2));

//prosit5
     Aquatiques a1 = new Aquatiques();
     Terrestres t1 = new Terrestres();
     Dolphin d1 = new Dolphin();
     Penguin p1 = new Penguin();
     Penguin p2 = new Penguin("p2",3,"habitat");

     p1.swim();
     a1.swim();
     d1.swim();

//prosit 6
     myZoo.addAquaticAnimal(d1);
     myZoo.addAquaticAnimal(p1);
     myZoo.addAquaticAnimal(p2);
     System.out.println(myZoo.maxPenguinSwimmingDepth());

     Aquatiques a2 =  new Penguin();

     myZoo.displayNumberOfAquaticsByType();

     System.out.println(p1.equals(myZoo2));





    }


}