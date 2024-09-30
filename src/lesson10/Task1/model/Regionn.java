package lesson10.Task1.model;

/**
 * Created by: Umar
 * DateTime: 8/24/2024 2:50 PM
 */
public class Regionn {
    private String name;

    public Regionn(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Regionn{" +
                "name='" + name + '\'' +
                '}';
    }
}
