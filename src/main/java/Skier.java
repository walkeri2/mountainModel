public class Skier extends Person implements IRent {

    public Skier(String name, int age){
        super(name, age);
    }


    public int rent(int days){
        return days;
    }

}
