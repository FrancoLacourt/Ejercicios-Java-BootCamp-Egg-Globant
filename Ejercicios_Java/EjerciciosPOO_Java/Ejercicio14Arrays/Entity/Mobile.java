package Entity;

import java.util.Arrays;

public class Mobile {

    private String brand;
    private double price;
    private String model;
    private int ram;
    private int storage;
    private int[] code = new int[7];

    public Mobile() {
    }

    public Mobile(String brand, double price, String model, int ram, int storage) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int[] getCode() {
        return code;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setCode(int[] code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Marca = " + brand + ", Precio = $" + price + ", Modelo = " + model + ", RAM = " + ram + "GB, Almacenamiento = " + storage + "GB, Código = " + Arrays.toString(code);
    }
}