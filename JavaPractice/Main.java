import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Magazine magazine = new Magazine(30);
        Gun gun = new Gun("M4A1");
        FireSelect fireselect = new FireSelect("", "", "");

        gun.BulletsInMagazine("M4A1", magazine);

        System.out.println("You want to shoot your gun? (Y)");
        String Q = scanner.nextLine().toLowerCase();
        if(Q.equals("y")) {
            fireselect.FireMode("","", "");
        } else if(Q.equals("n")) {
            System.exit(0);
        }
        scanner.close();
    }
}
