package com.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservationSystem{

    ArrayList<Hotel> hotelList = new ArrayList<>();

    public boolean addHotel(String hotelName,int rates, int rating){
        Hotel hotel = new Hotel(hotelName, rates, rating);
        hotelList.add(hotel);
        if(hotelList.isEmpty()){
            return false;
        }
        else
            return true;
    }
}