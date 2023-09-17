
package Entities;

public class Accomodation {
    
    protected String name;
    protected String address;
    protected String location;
    protected String manager;

    public Accomodation() {
    }

    public Accomodation(String name, String address, String location, String manager) {
        this.name = name;
        this.address = address;
        this.location = location;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }   
}