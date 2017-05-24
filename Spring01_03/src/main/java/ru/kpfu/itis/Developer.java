package ru.kpfu.itis;

/**
 * Created by Admin on 01.03.2017.
 */
public class Developer {
    private String name;
    private String speciality;
    private Integer experience;

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' + "Speciality: " + speciality + '\n' + "Experience: " + experience + "\n";
    }

    public void simpleMethod() {
        System.out.println("Simple method");
        throw new ClassCastException();
    }
}