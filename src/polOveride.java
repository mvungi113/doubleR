
class Vehicle{
    //
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{
    //

    void running(){
        System.out.println("Bike is Running");
    }
}

 class polOveride {

    public static void main(String args[]){
        Bike vehicle = new Bike();
        vehicle.running();
        vehicle.run();



    }
}
