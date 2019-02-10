package pl.sda.openweather;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.model.Weather;
import pl.sda.openweather.model.WeatherService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("TEST");
//
//        Weather weather = null;
//        try {
//            URL jsonURL = new URL("http://api.apixu.com/v1/current.json?key=e73bd5fd85ca4d8881d90312191002&q=Paris");
//            ObjectMapper objectMapper = new ObjectMapper();
//           weather = objectMapper.readValue(jsonURL,Weather.class);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (JsonParseException e) {
//            e.printStackTrace();
//        } catch (JsonMappingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        System.out.println(weather.toString());
//        System.out.println("Temperatura w " + weather.getLocation().getName() + " = " + weather.getCurrent().getTemp_c());

        Scanner scanner = new Scanner(System.in);
        System.out.println("City (multi part names with \'_' e.g. New_York: ");
        String city = scanner.nextLine();

        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json","e73bd5fd85ca4d8881d90312191002");
        weatherService.getCityWeather(city);


    }
}
