package com.stream_api_examples;

public class Hotel {

    private int id;
    private String name;
    private String city;
    private double rating;        // e.g., 4.5 stars
    private double pricePerNight; // e.g., $150.00
    private boolean hasWifi;
    private boolean hasParking;

    // ✅ Constructor
    public Hotel(int id, String name, String city, double rating, double pricePerNight, boolean hasWifi, boolean hasParking) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.rating = rating;
        this.pricePerNight = pricePerNight;
        this.hasWifi = hasWifi;
        this.hasParking = hasParking;
    }

    // ✅ Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double pricePerNight) { this.pricePerNight = pricePerNight; }

    public boolean isHasWifi() { return hasWifi; }
    public void setHasWifi(boolean hasWifi) { this.hasWifi = hasWifi; }

    public boolean isHasParking() { return hasParking; }
    public void setHasParking(boolean hasParking) { this.hasParking = hasParking; }

    // ✅ toString() for easy debugging/printing
    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", rating=" + rating +
                ", pricePerNight=" + pricePerNight +
                ", hasWifi=" + hasWifi +
                ", hasParking=" + hasParking +
                '}';
    }

}
