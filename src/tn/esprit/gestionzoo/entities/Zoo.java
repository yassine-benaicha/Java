package tn.esprit.gestionzoo.entities;

public class Zoo {
    public Animal[] animals;
  public  String name, city;
    ;
    private final int nbrCages = 25;
    public int nbrAnimals;
     public Aquatiques[] aquaticAnimals;
    int nbAquatic;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        setName(name);
        this.city = city;
        aquaticAnimals = new Aquatiques[10];

    }
    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", Cages: " + nbrCages);
    }
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ",  Cages: " + nbrCages;
    }
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    public void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }
    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }
    public boolean isZooFull() {
        return nbrAnimals == nbrCages;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            return null;
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide.");
        }
    }
    public void addAquaticAnimal(Aquatiques aquatic){
        if (aquaticAnimals == null) {
            aquaticAnimals = new Aquatiques[10];
        }
        if (nbAquatic < aquaticAnimals.length) {
            aquaticAnimals[nbAquatic] = aquatic;
            nbAquatic++;
        } else {
            System.out.println("No space to add more aquatic animals!");

        }
    }
    public float maxPenguinSwimmingDepth(){
        float maxDepth=0;
        for(int i=0;i<nbAquatic;i++){
            // if(aquaticAnimals[i].getClass()==Penguin.class)
            if(aquaticAnimals[i] instanceof Penguin){
                if(maxDepth<((Penguin)aquaticAnimals[i]).swimmingDepth){
                    maxDepth=((Penguin)aquaticAnimals[i]).swimmingDepth;
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType(){
        int nbD=0;
        int nbP=0;
        for(int i=0;i<nbAquatic;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                nbP++;
            }
            if(aquaticAnimals[i] instanceof Dolphin){
                nbD++;
            }
        }
        System.out.println("Le zoo :"+name+"contient :"+nbD+" Dolphin et "
                +nbP+" Penguin");
    }
}
