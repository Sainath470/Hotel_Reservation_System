package com.hotelreservationsystem;
import java.util.ArrayList;
import java.util.List;

public class HotelSystemRunner {
    public static void main(String[] args) {
        List<HotelReservationSystem> hotelSystem = new ArrayList<>();
        System.out.println("Welcome to the Hotel Reservation Program");
        hotelSystem.add(new HotelReservationSystem("Lakewood",110,90));
        hotelSystem.add(new HotelReservationSystem("Bridgewood",160,60));
        hotelSystem.add(new HotelReservationSystem("Ridgewood",220,150));
    }
}
