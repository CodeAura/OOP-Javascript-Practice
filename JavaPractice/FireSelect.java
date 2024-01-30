import java.util.Scanner;

public class FireSelect {
    public String FullAutomatic;
    public String SemiFire;
    public String SingleShot;
    public String fireMode;

    public FireSelect(String FullAutomatic, String SemiFire, String SingleShot) {
        this.FullAutomatic = FullAutomatic;
        this.SemiFire = SemiFire;
        this.SingleShot = SingleShot;
    }

    public String getFullAutomatic() {
        return this.FullAutomatic;
    }

    public String getSemiFire() {
        return this.SemiFire;
    }

    public String getSingleShot() {
        return this.SingleShot;
    }

    public void FireMode(String FullAutomatic, String SemiFire, String SingleShot) {
        Scanner scanner = new Scanner(System.in);
        FullAutomatic = null;
        SemiFire = null;
        SingleShot = null;

        System.out.println("Select a fire mode (Semi, Auto, Single)");
        String fireMode = scanner.nextLine().toUpperCase();
        if(fireMode.equals("Auto") || fireMode.equals("Semi") || fireMode.equals("Single")) {
            if(fireMode.equals("Auto")) {
                FullAutomatic = fireMode;
                SemiFire = null;
                SingleShot = null;
            } else if(fireMode.equals("Semi")) {
                FullAutomatic = null;
                SemiFire = fireMode;
                SingleShot = null;
            } else if(fireMode.equals("Single")) {
                FullAutomatic = null;
                SemiFire = null;
                SingleShot = fireMode;
            }
            scanner.close();
        }

    }

    public String getSelectedMode() {
        return this.fireMode;
    }
}
