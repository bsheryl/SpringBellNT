package core.generators;

import core.models.Animal;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AnimalsGenerator implements Generator {
    private static String[] types = {"Cat", "Dog", "Fish", "Bird", "Reptile", "Rabbit", "Hamster", "Ferret", "Horses",
            "Camel", "Chinchilla", "Pig", "Fox", "Turtle", "Sheep", "Squirrel", "Chipmunk"};
    private static String[] names = {"Bella", "Luna", "Lucy", "Daizy", "Zoe", "Lily", "Lola", "Bailey", "Stella",
            "Molly", "Max", "Charlie", "Milo", "Buddy", "Rocky", "Bear", "Leo", "Duke", "Teddy", "Tucker"};

    @Override
    public Object generate() {
        Random random = new Random();
        Animal animal = Animal.builder()
                .type(types[random.nextInt(types.length)])
                .name(names[random.nextInt(names.length)])
                .age(random.nextInt(10))
                .build();
        return animal;
    }
}
