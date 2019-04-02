public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String owner, int parkingSpot) {
        super(name, owner, parkingSpot);
    }

    public boolean isAllowed(Visitor visitor) {
        return visitor.getAge() >= 18;
    }

}
