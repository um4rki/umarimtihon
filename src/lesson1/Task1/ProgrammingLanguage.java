/*
package lesson1.Task1;

public class ProgrammingLanguage {
    private final String name  ;
    private final String owner ;
    private final int releaseDate ;

    public ProgrammingLanguage(String name, String owner, int releaseDate) {
        this.name = name;
        this.owner = owner;
        this.releaseDate = releaseDate;
    }

    public void isNull() throws Exception{
        if(this.name == null||this.owner == null||this.releaseDate == 0){
            throw new NullPointerException();
        }
    }


    public static void main(String[] args)  throws Exception{
        ProgrammingLanguages programmingLanguage = new ProgrammingLanguages("java" ,"Oracle" , 15);

        try {
            programmingLanguage.isNull();
        }catch (NullPointerException e){
            System.out.println("Programming Language is null " + e.getMessage());
        }
    }
}
*/
