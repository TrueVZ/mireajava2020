package ru.mirea.lab26;

public class City {
    private final String city;
    private final String country;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
