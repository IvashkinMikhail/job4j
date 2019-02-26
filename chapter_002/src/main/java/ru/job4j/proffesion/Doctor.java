package ru.job4j.proffesion;

public class Doctor extends Profession {
    private String profession = "Doctor";


    public Doctor(String name) {
        super(name);
    }

    public Diagnose heal(Pacient pacient) {
        Diagnose diagnose = new Diagnose(pacient);
        return diagnose;
    }

}
