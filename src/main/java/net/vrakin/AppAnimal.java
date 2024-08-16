package net.vrakin;

import net.vrakin.animal.Cat;
import net.vrakin.animal.Dog;
import net.vrakin.animal.Veterinarian;

/**
 * Hello world!
 *
 */
public class AppAnimal
{
    public static void main( String[] args )
    {
        Cat cat = new Cat();
        cat.setName("Garfield");
        cat.setRation("fish");
        cat.setColor("white");
        cat.setWeight(5000);

        System.out.println(cat.getVoice());
        cat.eat();
        cat.sleep();

        Dog dog = new Dog("meat", "black",
                7000, "Beethoven");

        System.out.println(dog.getVoice());
        dog.eat();
        dog.sleep();

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Jon");

        veterinarian.treatment(cat);
        veterinarian.treatment(dog);
    }
}
