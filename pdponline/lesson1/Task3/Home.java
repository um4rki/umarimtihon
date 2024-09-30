package lesson1.Task3;

import lesson3.homework_2.Names;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 12:54 PM
 */

public class Home {
    private int Qavat = 0;
    private String Rangi;
    private int RoomCount = 0;
    private String personName;


    public Home(int qavat, String rangi, int roomCount, String personName) {
        Qavat = qavat;
        Rangi = rangi;
        RoomCount = roomCount;
        this.personName = personName;
    }

    public int getQavat() {
        return Qavat;
    }

    public String getRangi() {
        return Rangi;
    }

    public int getRoomCount() {
        return RoomCount;
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public String toString() {
        return "Home{" +
                "Qavat=" + Qavat +
                ", Rangi='" + Rangi + '\'' +
                ", RoomCount=" + RoomCount +
                ", personName='" + personName + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception {

        Home home = new Home(5,null,45,null);

        if(home.getQavat()<0){
            throw new QavatCantBeLessThanZeroException("qavat 0 dab kichik bola olmaydi");
        } else if (home.getRangi().isEmpty() || home.getRangi().isBlank()) {
            throw new RangCantBeBlankException("color cantBe blank");
        }
        else if(home.getRoomCount()<10){
            throw new RoomCountCantBeLessThanTenException("room cantBe less than 10");
        } else if (home.getPersonName().isBlank() || home.getPersonName().isEmpty()) {
            throw new PersonNameCantBeBlankException("personName cantBe blank");
        }

        System.out.println("home = " + home);
    }
}
