public class Zoo {
    Animal[] animals;
    String name, city;
    int nbrCages;

    int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", Cages: " + nbrCages);
    }
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ",  Cages: " + nbrCages;
    }
}
