package com.hotelreservationsystem;

public class Hotel{
    String hotelName;
    double rates;
    int rating;

    public Hotel(String hotelName, double rates, int rating){
        this.hotelName = hotelName;
        this.rates = rates;
        this.rating = rating;
    }

    public Hotel(String HotelName, double rates){
        this.hotelName = HotelName;
        this.rates = rates;
    }


    public String getName() {
        return hotelName;
    }

    public double getRate() {
        return rates;
    }


    @Override
    public String toString() {
        return "Hotel name : " + this.hotelName + " rates for regular customer : " + this.rates;
    }
}