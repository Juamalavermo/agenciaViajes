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
public class Travel {
    private String start;
    private int duration;
    private BookedFlight outbound;
    private BookedFlight regreso;
    private Hotel[] hotel;

    public Travel(String start, int duration) {
        this.start = start;
        this.duration = duration;
        this.outbound = outbound;
        this.regreso = regreso;
        this.hotel = new Hotel[1];
    } 
    
    public int getDuration() {
        return duration;
    }

    public BookedFlight getOutbound() {
        return outbound;
    }

    public BookedFlight getRegreso() {
        return regreso;
    }

    public Hotel[] getHotel() {
        return hotel;
    }

    @Override
    public String toString() {
        return "Travel{" + "outbound=" + outbound + ", regreso=" + regreso + '}';
    }
  
    
    
    
    
}

