package com.defcoding;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.defcoding.FlightSearchService.flightSearch;

public class App {

    /*
    public void processPersonalDetails(String [] args) {
        if(!isValidEmail(args[0])) {

        }
    }*/
    public boolean isValidEmail(String inputEmail) {
        Pattern validEmail = Pattern.compile("^[A-z0-9._%+-]+@[A-z0-9.-]+\\.[A-Z] {2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = validEmail.matcher(inputEmail);
        return matcher.find();
    }

    /**
     * Provide arguments, for example: 2 "15-10-2019" "Boston" "New York"
     */
    public static void main(String[] args){

        int passengerNum = Integer.parseInt(args[0]);
        String departDate = args[1];
        String fromDestination = null; //args[2];
        String toDestination = args[3];


        FlightSearchService searchService = flightSearch();

        List<Flight> outboundFlights =
                searchService.search(fromDestination, toDestination, departDate, passengerNum);

        displayFlights(outboundFlights);
    }

    private static void displayFlights(List<Flight> outboundFlights) {
        if(outboundFlights.isEmpty()){
            System.out.println("No flights found for your search criteria.");
        } else {
            System.out.println("Flights found:");
            System.out.println(Arrays.toString(outboundFlights.toArray()));
        }
    }
}
