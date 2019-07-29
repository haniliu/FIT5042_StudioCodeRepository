/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository.entities;

/**
 *
 * @author Jian
 * 
 */
public class Property {

    @Override
    public String toString() {
        return "Property{" + "id=" + id + ", address=" + address + ", size=" + size + ", price=" + price + '}';
    }

    public Property(int id, String address, int size, double price) {
       this.id = id;
       this.address = address;
       this.size = size;
       this.price = price;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

   //TODO Exercise 1.3 Step 1 Please refer tutorial exercise. 
    private int id;
    private String address;
    private int size;
    private double price;
    
    
}
