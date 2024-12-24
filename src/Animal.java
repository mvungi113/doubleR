
//parent class
class Animal{
    String birth = "Ndio yana zaliana";
    String moveBy;
    //method
     void eat(){
         System.out.println("They eat and " + birth);
     }
}

class Dog extends Animal{
@Override
    void eat(){
        moveBy = "Four Limbs";
        System.out.println("Whooo  Whoo ..." + moveBy );
    }
}

 class Lion extends Animal{

     void nguruma(){
         super.eat();
         moveBy = "Four Limbs";
         System.out.println("ghuuu  ghuuu ..." + moveBy );
     }
 }



class Mains {
     public static void main(String args[]){
//        Animal dog = new Dog();
//        dog.eat();
//
//        Dog bosco = new Dog();
//        bosco.eat();

        Lion lion = new Lion();
        lion.nguruma();
     }
 }