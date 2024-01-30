import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Magazine magazine = new Magazine(30);
        Gun gun = new Gun("M4A1");
        FireSelect fireselect = new FireSelect(null, null, null);
        Shoot shoot = new Shoot(null);

        gun.BulletsInMagazine("M4A1", magazine);

        System.out.println("You want to shoot your gun? (Y)");
        String Q = scanner.nextLine().toLowerCase();
        if(Q.equals("y")) {
            fireselect.FireMode(null,null, null);
        } else if(Q.equals("n")) {
            System.exit(0);
        }
        scanner.close();
        shoot.ShootTheGun(fireselect, magazine, gun);
    }
}
