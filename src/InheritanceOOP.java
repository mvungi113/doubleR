
//parent class
class Employee{
    //methode
    void receive(){
        System.out.println("Receive Salary");
    }
}

//child class
class Bonus extends Employee{
    void add(){
        System.out.println("Welcome add");
    }
}

public class InheritanceOOP {
    public static void main(String args[]){
        Bonus xmasBonus = new Bonus();
        xmasBonus.receive();
        xmasBonus.add();
    }


}
