package net.vrakin.animal;

public class Cat extends Animal {

    private String name;

    public Cat(String ration, String color,
               int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
    }

    @Override
    public String getVoice(){
        return "myau";
    }

    @Override
    public void eat() {
        System.out.printf("I am cat. %nI am eating %s%n", this.getRation());
    }

    @Override
    public void sleep() {
        System.out.printf("I am cat. %nMy name is %s%nI am sleeping%n", this.name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
