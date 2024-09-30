package lesson3.homework_2;

import java.util.*;

public class Names {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String> dublicatNames = new ArrayList<>();

        names.add("Furqat");
        names.add("Sarvar");
        names.add("Navruz");
        names.add("Javlon");
        names.add("Shohjahon");
        names.add("Umar");
        names.add("Xondamir");
        names.add("Javlon");
        names.add("Shoxbek");
        names.add("Bositxon");
        names.add("Muhammadali");
        names.add("Muhammadjon");
        names.add("Og'abek");


        for (int i = 0; i < names.size(); i++) {
            for (int j = i+1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    dublicatNames.add(names.get(i));
                }
            }
        }


        names.removeAll(dublicatNames);



        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}
