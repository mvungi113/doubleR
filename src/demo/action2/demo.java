package demo.action2;

import java.util.Scanner;

public class demo {
       public void display(){

     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter First Name");
     String firstName = scanner.nextLine();

     System.out.println("Enter Lastname");
     String lastName = scanner.nextLine();
     System.out.println("Enter Age:");
     int age = scanner.nextInt();

     System.out.println("Your Month Salary :");
     double salary = scanner.nextDouble();

           System.out.println("Your Username :" + firstName +" " + lastName );
            System.out.println("Your age :" + age);
            System.out.println("Your Salary is :  " + salary);

    }

    public void Arithmetic(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num1 & Num2 :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

//        /sum
//        /sum
//        /sum

        int sum =  num1 + num2;
        int mult = num1 * num2;
        int sub = num1 - num2;
        int div = num1 / num2;

        System.out.println("Sum :" + sum);
        System.out.println("Mult :" + mult);
        System.out.println("Sub :" + sub);
        System.out.println("Div :" + div);
    }


}

