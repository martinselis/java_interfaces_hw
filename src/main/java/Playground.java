public class Playground extends Attraction implements ISecurity {

    public Playground(String name) {
        super(name);
    }

    public boolean isAllowed(Visitor visitor) {
        return visitor.getAge() <= 15;
    }


}
