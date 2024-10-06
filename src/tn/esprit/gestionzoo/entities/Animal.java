package tn.esprit.gestionzoo.entities;

public class Animal {

   public String family, name;
    public int age;
   public boolean isMammal;

    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "family:'" + family  +
                ", name:'" + name  +
                ", age:" + age +
                ", isMammal:" + isMammal
                ;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Erreur : L'âge ne peut pas être négatif.");
        }
    }
}