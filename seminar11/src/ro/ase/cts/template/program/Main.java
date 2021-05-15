package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorNormal;
import ro.ase.cts.template.clase.SpectatorVip;

public class Main {
    public static void main(String[] args) {
        SpectatorNormal spectatorNormal = new SpectatorNormal("Gigel");
        SpectatorVip spectatorVip = new SpectatorVip("Bastanie", 3);
        spectatorNormal.intraPeStadion();
        System.out.println("--------------------------------");
        spectatorVip.intraPeStadion();
    }
}
