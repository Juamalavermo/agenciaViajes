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
public class Hotel {
    private String name;
    private String address;

    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Hotel{" + "name=" + name + ", address=" + address + '}';
    }
    
    
}
