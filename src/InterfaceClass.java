

interface SET{
    public void study();
    public void venue();

}

class College implements SET{
    @Override
    public void study() {
        System.out.println("Studying Math");
    }

    @Override
    public void venue() {
        System.out.println("Venue is d006");
    }
}


public class InterfaceClass {
    public static void main(String args[]){
        College college = new College();
        college.study();
        college.venue();
    }
}
