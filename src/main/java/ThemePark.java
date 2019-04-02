import java.util.ArrayList;

public class ThemePark {

    public ArrayList<IReviewed> getAllReviewed() {

        TobaccoStall tobaccoStall = new TobaccoStall("Sundae", "Joe", 10);
        IcecreamStall icecreamStall = new IcecreamStall("Sundae", "Joe", 10);
        Rollercoaster rollercoaster = new Rollercoaster("Fun Rollercoaster");

        ArrayList<IReviewed> arrayOfReviews = new ArrayList<>();
        arrayOfReviews.add(tobaccoStall);
        arrayOfReviews.add(icecreamStall);
        arrayOfReviews.add(rollercoaster);

        return arrayOfReviews;
    }
}
