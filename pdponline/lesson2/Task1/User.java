package lesson2.Task1;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 5:22 PM
 */
public class User implements Comparable{

    private String name;

    public User(String name) {
        this.name = name;
    }



    @Override
    public int compareTo(Object o) {
        return name.compareTo(((User)o).name);
    }

    public static void main(String[] args) {
        User user1 = new User("Ali");
        User user2 = new User("Vali");

        System.out.println(user1.compareTo(user2));
    }


    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <T extends Comparable> int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
