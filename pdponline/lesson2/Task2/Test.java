package lesson2.Task2;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 5:44 PM
 */
public class Test {
    public static void main(String[] args) {
        AnimalHouse<Animal> animalHouse = new AnimalHouse<>(new Cat("Cat"));
        AnimalHouse<Animal> animalHouse2 = new AnimalHouse<>(new Dog("Dog"));
        AnimalHouse<Animal> animalHouse3 = new AnimalHouse<>(new Horse("Horse"));

        System.out.println("animalHouse2 = " + animalHouse2);
    }
}
