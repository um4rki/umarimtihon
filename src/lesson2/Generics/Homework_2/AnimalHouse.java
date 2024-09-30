package lesson2.Generics.Homework_2;

public class AnimalHouse<E extends Animal> {
    private E animal;

    public E getAnimal() {
        return animal;
    }

    public void setAnimal(E animal) {
        this.animal = animal;
    }
}
