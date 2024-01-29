public class Gun {
    public String gunName;


    public Gun(String gunName) {
        this.gunName = gunName;
    }
    
    public String getGunName() {
        return this.gunName;
    }

    public void setGunName(String gunName) {
        this.gunName = gunName;
    }



    public void BulletsInMagazine(String gunName, Magazine magazine) {
        System.out.println("Gun name is: " + getGunName());
        System.out.println("Total Bullets in the Magazine: " + magazine.getBullets());

    }
}
