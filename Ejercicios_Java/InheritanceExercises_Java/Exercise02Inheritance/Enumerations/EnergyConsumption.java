
package Services.Enumerations;

public enum EnergyConsumption {
    A(1000d), B(800d), C(600d), D(500d), E(300d), F(100d);
    
    private Double value;

    private EnergyConsumption(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}