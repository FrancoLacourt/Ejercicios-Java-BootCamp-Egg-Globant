package Entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rent {

    private String clientName;
    private String clientId;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private String mooringPosition;
    private Ship ship;

    public Rent() {
    }

    public Rent(String clientName, String clientId, LocalDate rentalDate, LocalDate returnDate, String mooringPosition, Ship ship) {
        this.clientName = clientName;
        this.clientId = clientId;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.mooringPosition = mooringPosition;
        this.ship = ship;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getMooringPosition() {
        return mooringPosition;
    }

    public void setMooringPosition(String mooringPosition) {
        this.mooringPosition = mooringPosition;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
    
    //Instead of re-write the method, I decided to get different results depending on the class of the object that is calling the method.
    public Double finalPrice() {

        long occupationDayNumber = ChronoUnit.DAYS.between(rentalDate, returnDate);

        Double module = ship.getLength() * 10;

        if (ship instanceof Sailboat) {
            Sailboat object = (Sailboat) ship;
            return (occupationDayNumber * module) + object.getMastNumber();
        } else if (ship instanceof MotorBoat) {
            MotorBoat object = (MotorBoat) ship;
            return (occupationDayNumber * module) + object.getEnginePowerInHP();
        } else if (ship instanceof LuxuryYacht) {
            LuxuryYacht object = (LuxuryYacht) ship;
            return (occupationDayNumber * module) + object.getCabinNumber() + object.getEnginePowerInHP();
        } else {
            return (occupationDayNumber * module);
        }
    }

    @Override
    public String toString() {
        return "Client name: " + clientName + ". Client ID: " + clientId + ". Rental date: " + rentalDate + ". Return date: " + returnDate + ". Mooring position: " + mooringPosition
             + "." + "\n" + ship.toString();
    }
}