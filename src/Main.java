class Coict{
    //properties / fields
    int id;
    String name;

    //method
    public String student(String name, int id){
        return name + id;
    }

}

public class Main {
    public static void main(String[] args){
        Coict s1 = new Coict();
        int reg = s1.id=23;
       String Sname= s1.name="Hawawe";

        System.out.println("reg " +reg + " " + Sname);
    }
}