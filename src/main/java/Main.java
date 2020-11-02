import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Api api = new Api();
        List<FlightData> flightsData = api.flights.getFlights();
        ArrayList<Integer> mskKhvCoasts = new ArrayList<>();
        for (FlightData flights : flightsData) {
            if (flights.fromCity.equals("Москва") && flights.toCity.equals("Хабаровск")) {
                mskKhvCoasts.add(flights.price);
            }
        }
        Collections.sort(mskKhvCoasts);

        MskKhvCoasts coasts = new MskKhvCoasts();
        coasts.getMinCoast(mskKhvCoasts);
        coasts.getMaxCoast(mskKhvCoasts);
        coasts.getAverageCoast(mskKhvCoasts);
    }
}