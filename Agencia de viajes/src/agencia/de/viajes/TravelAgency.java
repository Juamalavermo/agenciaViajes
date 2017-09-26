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
public class TravelAgency {
   private String name;
   private Airport[] airports;
   private Travel[] offeredTravels;
   private Hotel[] knownHotels;
   private int numViajes;

    public TravelAgency(String name) {
        this.name = name;
        this.airports = new Airport[4];
        this.offeredTravels = new Travel[10];
        this.knownHotels = new Hotel[5];       
        this.numViajes = 0;
    }
     public boolean agregarViaje (String start, int duration){
      Travel travel = new Travel(start, duration);
      if(this.numViajes < 10){
         this.offeredTravels[this.numViajes] = travel;
         this.numViajes++;
         return true;
      }else 
          return false;
    }
        
   public String ListInfo (Travel travel, BookedFlight outbound,BookedFlight regreso, Airport airport, int numLista){
           this.offeredTravels[numLista] = travel;
           String informacion = "#outbound: " + outbound.getFlightNumber() + "  #return: " + regreso.getFlightNumber() + "  Airport: "+ airport.getDescription();  
       return informacion;
   }
   
     
   
   
   
   
}
