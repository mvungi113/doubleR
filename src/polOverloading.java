class Addition{
    //method 1
    public int sum(int x, int y){

        return x+y;
    }

    //method 2
    public int sum(int x, int y, int z){
        return x+y+z;
    }

    //method 3
    public double sum(double x, double y){

        return x+y;
    }


}

public class polOverloading {
    public  static void main(String args[]){
        Addition add = new Addition();
        System.out.println(add.sum(4,6));
        System.out.println(add.sum(4,6, 7));
        System.out.println(add.sum(4.05,6.9));

    }

}
