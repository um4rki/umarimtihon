package lesson2.Generics.Homework_2;

public class Main {
    public static void main(String[] args) {
        AnimalHouse<Dog> dogHouse = new AnimalHouse<>();
        dogHouse.setAnimal(new Dog("Buddy"));
        System.out.println("Dog's name: " + dogHouse.getAnimal().getName());

        AnimalHouse<Cat> catHouse = new AnimalHouse<>();
        catHouse.setAnimal(new Cat("Whiskers"));
        System.out.println("Cat's name: " + catHouse.getAnimal().getName());

        AnimalHouse<Horse> horseHouse = new AnimalHouse<>();
        horseHouse.setAnimal(new Horse("Kobra"));
        System.out.println("Horse's name: " + horseHouse.getAnimal().getName());

        AnimalHouse<Sheep> sheepHouse = new AnimalHouse<>();
        sheepHouse.setAnimal(new Sheep("SHEE"));
        System.out.println("sheep's name: " + sheepHouse.getAnimal().getName());

    }
}
