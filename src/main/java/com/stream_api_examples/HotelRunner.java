package com.stream_api_examples;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.Collectors;

public class HotelRunner {

    static List<Hotel> hotels = null;

    public static void getHasWifiByPriceLowtoHigh(){
        Map<String, Double> WifiByPriceLowtoHigh = new LinkedHashMap<>();

        // Step 1: Filter hotels with WiFi and store in a list
        List<Hotel> hotelsWithWifi = new ArrayList<>();
        for (Hotel hotel : hotels){
            if (hotel.isHasWifi()){
                hotelsWithWifi.add(hotel);
            }
        }
        // Step 2: Sort the list by price (low to high)
        Collections.sort(hotelsWithWifi, new Comparator<Hotel>() {
            @Override
            public int compare(Hotel o1, Hotel o2) {
                return Double.compare(o1.getPricePerNight(), o2.getPricePerNight());
            }
        });

        // Step 3: Store sorted name → price in a LinkedHashMap to preserve order
        for (Hotel hotel : hotelsWithWifi) {
            WifiByPriceLowtoHigh.put(hotel.getName(), hotel.getPricePerNight());
        }

        // Optional: Print the map
        for (Map.Entry<String, Double> entry : WifiByPriceLowtoHigh.entrySet()){
            System.out.println(entry.getKey() + " → $" + entry.getValue());
        }
    }

    public static void useJava8Implamentation(){

        List<Hotel> hotelPriceByHightoLow =hotels.stream()
                .filter(hotel -> hotel.isHasWifi()==true)
                .sorted(Comparator.comparing(Hotel::getPricePerNight).reversed())
                .map(Hotel->Hotel)
                .collect(Collectors.toList());

        Map<String, Double> hotelNameAndPrice = new LinkedHashMap<>();
        hotelPriceByHightoLow.forEach(hotels -> hotelNameAndPrice.put(hotels.getName(), hotels.getPricePerNight()));

        for (Map.Entry<String, Double> entry : hotelNameAndPrice.entrySet()){
            System.out.println(entry.getKey() + " → $" + entry.getValue());
        }

       List<String> hotelPriceByHightoLow1 = hotels.stream()
                .filter(hotel -> hotel.isHasWifi()==false && hotel.isHasParking()==true)
                .sorted(Comparator.comparing(Hotel::getPricePerNight).reversed())
                .map(hotel -> hotel.getName())
                .collect(Collectors.toList());
        hotelPriceByHightoLow1.forEach(System.out::println);
    }

    public static void LimitDataUsingStreamAPI(){
        System.out.println("\nLimit the list of Data\n");

        long noOfHotelsHasWifi =hotels.stream()
                .filter(hotel -> hotel.isHasWifi()==true)
                .count();
        System.out.println("Count of Hotels Has Wifi : "+noOfHotelsHasWifi);

        hotels.stream()
                .filter(hotel -> hotel.isHasWifi()==true)
                .sorted(Comparator.comparing(Hotel::getPricePerNight))
                .limit(3)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel(1, "Sunset Resort", "Goa", 4.5, 150.00, true, true);
        Hotel hotel2 = new Hotel(2, "Ocean View", "Mumbai", 4.2, 180.00, true, false);
        Hotel hotel3 = new Hotel(3, "Hilltop Inn", "Manali", 4.8, 200.00, false, true);
        Hotel hotel4 = new Hotel(4, "City Lights Hotel", "Delhi", 4.0, 130.00, true, true);
        Hotel hotel5 = new Hotel(5, "Royal Heritage", "Jaipur", 3.9, 110.00, false, true);
        Hotel hotel6 = new Hotel(6, "Lakeside Retreat", "Udaipur", 4.6, 160.00, true, true);
        Hotel hotel7 = new Hotel(7, "Budget Stay", "Pune", 3.5, 70.00, false, false);
        Hotel hotel8 = new Hotel(8, "Mountain View Lodge", "Shimla", 4.3, 145.00, true, false);
        Hotel hotel9 = new Hotel(9, "The Grand Palace", "Hyderabad", 4.7, 220.00, false, true);
        Hotel hotel10 = new Hotel(10, "Urban Nest", "Bangalore", 4.1, 140.00, true, false);

       hotels = Arrays.asList(hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7, hotel8, hotel9, hotel10);
        System.out.println("Print List of Hotels \n");
        hotels.forEach(hotel -> System.out.println(hotel.getName()));
        System.out.println("\n Filter Hotels has wifi and price by low to high\n");
        getHasWifiByPriceLowtoHigh();

        System.out.println("\n Filter Hotels has wifi and price by High to Low\n");
//        useJava8Implamentation();
          LimitDataUsingStreamAPI();
    }
}
