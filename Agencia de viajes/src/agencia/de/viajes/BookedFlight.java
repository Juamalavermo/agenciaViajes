/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia.de.viajes;

/**
 *
 * @author Julian
 */
public class BookedFlight {
    private int flightNumber;
    private String departure;
    private String arrival;
    private Airport from;
    private Airport to;

    public BookedFlight(int flightNumber, String departure, String arrival) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.from = from;
        this.to = to;
    }

    
    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "BookedFlight{" + "flightNumber=" + flightNumber + ", departure=" + departure + ", arrival=" + arrival +  '}';
    }
    
    
    
    
    
}
