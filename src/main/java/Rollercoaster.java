public class Rollercoaster extends Attraction implements ITicketed{

    public Rollercoaster(String name) {
        super(name);
    }

    public double defaultPrice() {
        return 1.0;
    }

    public double priceFor(Visitor visitor) {
        return 0.05;
    }
}
