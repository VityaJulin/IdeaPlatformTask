import java.util.ArrayList;
import java.util.Collections;

public class MskKhvCoasts implements FlightsCoasts {


    @Override
    public void getMinCoast(ArrayList<Integer> coast) {
        System.out.println("Minimum ticket coast: " + Collections.min(coast));
    }

    @Override
    public void getMaxCoast(ArrayList<Integer> coast) {
        System.out.println("Maximum ticket coast: " + Collections.max(coast));
    }

    @Override
    public void getAverageCoast(ArrayList<Integer> coast) {
        int middleIndex = coast.size() / 2;
        System.out.println("Average ticket coast: " + coast.get(middleIndex).toString());

    }
}
