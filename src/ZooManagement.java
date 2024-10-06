import java.util.Scanner;

public class ZooManagement {
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
    }
}