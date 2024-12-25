class KOICT {
    void study(){
        System.out.println("This is CoICT");
    }
}

class cse extends KOICT{
    void study(){
        System.out.println("CSE study Maths");
    }
}


class IF extends KOICT{
    void study(){
        System.out.println("IF study computing");
    }
}


class ist extends KOICT{
    void study(){
        System.out.println("IST study software development");
    }
}

class Telecom extends KOICT{
    void study(){
        System.out.println("Telecom study Electronic");
    }
}

public class demoPol{
    public static void main(String args[]){
        KOICT coict = new KOICT();
        coict.study();

        KOICT cs = new cse();
        cs.study();

        IF info = new IF();
        info.study();

        ist i = new ist();
        i.study();

        Telecom telecom = new Telecom();
        telecom.study();




    }
}