public class Snowboarder extends Person implements IRent{

    public Snowboarder(String name, int age){
        super(name, age);
    }

    public int rent(int days){
        return days;
    }
}
