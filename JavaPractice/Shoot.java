public class Shoot {

    public FireSelect fireSelect;

    public Shoot(FireSelect fireSelect) {
        this.fireSelect = fireSelect;
    }


    public void ShootTheGun(FireSelect fireSelect, Magazine magazine, Gun gun) {
        System.out.println("Selected gun: " + gun.getGunName());
        System.out.println("Bullets: " + magazine.getBullets());
        System.out.println("Selected Mode: " + fireSelect.getSelectedMode());

        System.out.println("trrrrrrrrrrrrrrrrrt");
    }
}
