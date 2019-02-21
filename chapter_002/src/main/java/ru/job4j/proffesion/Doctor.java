package ru.job4j.proffesion;

public class Doctor extends Profession {
    private String profession = "Doctor";
    private Object Diagnose;


    public Doctor(String name) {
        super(name);
    }

    public Diagnose heal(Pacient pacient) {
        this.Diagnose = new Diagnose(pacient);
        return (ru.job4j.proffesion.Diagnose) Diagnose;
    }

}
