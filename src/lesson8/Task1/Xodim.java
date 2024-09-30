package lesson8.Task1;

/**
 * Created by: Umar
 * DateTime: 8/21/2024 2:10 PM
 */

public class Xodim implements Cloneable{
    private String name;
    private Bolim bolim;

    public Xodim(String name, Bolim bolim) {
        this.name = name;
        this.bolim = bolim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bolim getBolim() {
        return bolim;
    }

    public void setBolim(Bolim bolim) {
        this.bolim = bolim;
    }

    @Override
    public Xodim clone() {
        try {
            Xodim clone = (Xodim) super.clone();
            clone.setBolim(bolim.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return  "{" + name + " , " + bolim + "}" ;
    }

    public static void main(String[] args) {
        Filial toshkent1 = new Filial("Toshkent");
        Bolim toshkent = new Bolim(toshkent1, "Farg'ona");
        Xodim xodim = new Xodim("javlon", toshkent);
        System.out.println(xodim);
        Xodim xodimClone = (Xodim) xodim.clone();


        xodim.getBolim().setAdress("Andijon");
        xodimClone.getBolim().setAdress("Qarshi");
        xodimClone.getBolim().setFilial(new Filial("Qo'qon"));
        System.out.println("o'zgarmagan = " + xodim);
        System.out.println("o'zgargan = " + xodimClone);
    }
}

class Bolim implements Cloneable{
    private Filial filial;
    String adress;


    public Bolim(Filial filial, String adress) {
        this.filial = filial;
        this.adress = adress;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public Bolim clone() {
        try {
            Bolim clone = (Bolim) super.clone();
//            clone.setFilial(filial.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return filial +" , " +  adress;
    }
}

class Filial implements Cloneable{
    String name;

    public Filial(String name) {
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
        return name;
    }


    @Override
    public Filial clone() {
        try {
            Filial clone = (Filial) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}