package lesson2.Task2;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 5:32 PM
 */
public class AnimalHouse <E extends Animal>{
    private E animal;

    public AnimalHouse(E animal) {
        this.animal = animal;
    }

    public void setName(E animal) {
        this.animal = animal;
    }

    public E getName() {
        return animal;
    }


    @Override
    public String toString() {
        return "AnimalHouse{" +
                "animal=" + animal +
                '}';
    }
}
