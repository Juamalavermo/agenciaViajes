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
public class AgenciaDeViajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación de objetos
        TravelAgency travelAgency = new TravelAgency("Aviatur");
        Hotel hotel = new Hotel("Fontanar", "Cra 21A #159A - 28");
        Travel travel = new Travel("22/03/2017", 30);
        BookedFlight bookedFlight = new BookedFlight(1345, "22/03/2017", "22/03/2017");
        Airport airport1 = new Airport("Jose Maria Cordoba");
        Airport airport2 = new Airport("Dorado");
        
        //Invocar el método de listar
       String a = travelAgency.ListInfo(bookedFlight, bookedFlight, airport2);
        System.out.println(a);
        
        
    }
    
}
