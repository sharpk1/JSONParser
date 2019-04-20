import model.Month;
import parser.WeatherParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/*
    Feel free to edit this file as you see fit.
 */
public class Weather {

    /*
        Edit this method to read in the weatherFile provided
     */
    private static Month readFile() throws IOException {
 
        String weatherFile = Weather.class.getClassLoader().getResource("weather.json").getFile();
        String weatherData = ""; // Parse the weatherFile here;
        return WeatherParser.parseData(weatherData);
    }
    
    
    /*
        The main method for running the program. The output should be done here
        Output should be the following format:
        Day: 18
        Spread: 99
     */
    public static void main(String[] args) throws IOException{
        Month month = readFile();
    	
   
    }
}

