
class Person{
    private String firstName;
    private String lastName;
    private int age;

    //setter method

    public void setPerson(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName = lastName;
        this.age=age;
    }

    //getter method
    public String getPerson(){
        return firstName + " " + lastName + " " + age;
    }

    void display(){
        System.out.println("FirstName : "+ firstName + " LastName :" + lastName + " Your " + age +" Years old");
    }
}

public class encapsulations {
public static void main(String args[]){
    Person person = new Person();
    person.setPerson("Asha", "Kindo" , 13);
    System.out.println(person.getPerson());

    person.display();
}
}
