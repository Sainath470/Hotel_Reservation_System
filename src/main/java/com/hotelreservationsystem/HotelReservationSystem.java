package com.hotelreservationsystem;
public class HotelReservationSystem{
    String hotelName;
    int weekdayRateForRegularCustomer;
    int weekendRateForRegularCustomer;


    public  HotelReservationSystem(String name, int weekdayRegular, int weekendRegular){
        this.hotelName = name;
        this.weekdayRateForRegularCustomer = weekdayRegular;
        this.weekendRateForRegularCustomer = weekendRegular;
        System.out.println("HOTEL NAME :"+hotelName+"\nWEEKDAY RATE FOR REGULAR CUSTOMER:"+weekdayRateForRegularCustomer+"\nWEEKEND RATE FOR REGULAR CUSTOMER:"+ weekendRateForRegularCustomer+"\n");
    }


}
