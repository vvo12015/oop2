package net.vrakin.animal;

public class Veterinarian {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian() {
    }

    public void treatment(Animal animal) {
        String animalType = animal.getClass().getSimpleName();
        System.out.printf("I am veterinarian. My name is %s%n" +
                        "This animal is %s%n" +
                        "it is %s%n" +
                "it eats %s%n" +
                "it has a voice - %s%n" +
                "it has a weight - %s%n"
                , this.name
                , animalType
                , animal.getColor()
                , animal.getRation()
                , animal.getVoice()
                , animal.getWeight()
        );
        System.out.println("I am treating " + animalType);
    }
}
