package ru.mirea.lab27.task2;

import java.util.StringTokenizer;

public class Address {
    private final String country;
    private final String region;
    private final String city;
    private final String street;
    private final String house;
    private final String build;
    private final String apartment;

    public Address(String address){
        String[] values = address.split(",");
        country = values[0].trim();
        region = values[1].trim();
        city = values[2].trim();
        street = values[3].trim();
        house = values[4].trim();
        build = values[5].trim();
        apartment = values[6].trim();
    }

    public Address(String address, String split){
        StringTokenizer values = new StringTokenizer(address, split);
        country = values.nextToken().trim();
        region = values.nextToken().trim();
        city = values.nextToken().trim();
        street = values.nextToken().trim();
        house = values.nextToken().trim();
        build = values.nextToken().trim();
        apartment = values.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", build='" + build + '\'' +
                ", apartament='" + apartment + '\'' +
                '}';
    }
}
