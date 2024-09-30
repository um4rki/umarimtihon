/*
package lesson1.Task3;

public class Home {
    private int floor;
    private String color;
    int roomCount;
    private String personName;

    public Home(int floor, String color, int roomCount, String personName) throws Exception{
        if(floor<0){
            throw new QavatCantBeLessThanZeroException("Noto'g'ri ma'lumot kiritdingiz!!!");
        }if(color == null || color.isEmpty()){
            throw new RangCantBeBlankException("Rangi null bo'lishi mumkin emas!!!");
        }if(roomCount < 10){
            throw new RoomCountCantBeLessThanTenException("Xonalarning tartib raqami 10 dan kichik bo'lmasligi kerak!!!");
        }if (personName == null || personName.isEmpty()){
            throw new PersonNameCantBeBlankException("Person name null bo'lmasligi kerak!!!");
        }

        this.floor = floor;
        this.color = color;
        this.roomCount = roomCount;
        this.personName = personName;
    }

    public static void main(String[] args) throws Exception{

        try {
            Home home = new Home(15,null,1,"Navruz");
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
*/
