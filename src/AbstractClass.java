
abstract class COSTE{
    public abstract void department();

    public void costeIST(){
        System.out.println("The first department");
    }
}

class Hod extends COSTE{
    public void department() {
        System.out.println("Stanley is the HoD");
    }
}

public class AbstractClass {
    public static void main(String args[]){
        Hod hod = new Hod();
        hod.department();
        hod.costeIST();
    }
}
