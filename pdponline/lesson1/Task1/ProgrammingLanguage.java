package lesson1.Task1;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 12:01 PM
 */
public class ProgrammingLanguage {
    private String name;
    private String owner;
    private int releaseDate;

    public ProgrammingLanguage(String name, String owner, int releaseDate) {
        this.name = name;
        this.owner = owner;
        this.releaseDate = releaseDate;
    }

    public boolean isNull(){
        if(this.name == null || this.owner == null || this.releaseDate == 0){
            throw new NullPointerException("Name and owner cannot be null");
        }
        return true;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }

    public static void main(String[] args) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage( null,"Oracle",15);

        try {
            System.out.println( programmingLanguage.isNull());
        }catch (NullPointerException e){
            System.out.println("e.getMessage() => " + e.getMessage());
        }
    }
}
