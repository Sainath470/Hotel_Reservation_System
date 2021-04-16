package com.hotelreservationsystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest {

    HotelReservationSystem hotelReservation = new HotelReservationSystem();

    @Test
    public void checkedGivenHotelName_ReturnTrue_WhenAdded(){
        boolean result = hotelReservation.addHotel("Lakewood",110,4);
        System.out.println(result);
        Assertions.assertTrue(result);
    }

}