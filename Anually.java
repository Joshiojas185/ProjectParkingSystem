package pass;

import java.time.LocalDateTime;
import java.time.LocalTime;

import vehicle.Vehicle;

public class Anually extends Pass {
    private LocalDateTime expiry = LocalDateTime.now();
    private int price = 0;
    Anually(Vehicle vehicle, LocalTime inTime){
        super(vehicle,inTime);
    }
    public int getPrice() {
        String type = this.vehicle.getType();
        return type == "cycle" ? 500 : (type == "bike" ? 1000 : 5000);
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public LocalDateTime getExpiry() {
        return expiry.plusYears(1);
    }
    public void setExpiry(LocalDateTime expiry) {
        this.expiry = expiry;
    }
}