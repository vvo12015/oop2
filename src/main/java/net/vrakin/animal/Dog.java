package net.vrakin.animal;

public class Dog extends Animal {

    private String name;

    public Dog(String ration, String color,
               int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog() {
    }

    @Override
    public String getVoice(){
        return "gau";
    }

    @Override
    public void eat() {
        System.out.printf("I am dog. %n" +
                "I am eating %s%n", this.getRation());
    }

    @Override
    public void sleep() {
        System.out.printf("I am dog.%nMy name is %s%n" +
                "I am sleeping%n", this.name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "ration='" + super.getRation() + '\'' +
                ", color='" + super.getColor() + '\'' +
                ", weight=" + super.getWeight() +
                '}';
    }
}
