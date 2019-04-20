package parser;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Month;

import java.io.IOException;

public class WeatherParser {

    public static Month parseData(String data) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(data, Month.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
