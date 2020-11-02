import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;

public class Api {
    private static final String FILE_PATH = "/home/molchanov/IdeaPlatformTask/src/main/java/flights.json";
    File json = new File(FILE_PATH);
    Gson gson = new Gson();
    JsonReader reader;

    {
        try {
            reader = new JsonReader(new FileReader(json));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Type modelType = new TypeToken<Flights>() {
    }.getType();
    Flights flights = gson.fromJson(reader, modelType);
}

