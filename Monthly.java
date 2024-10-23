package pass;

import java.time.LocalDateTime;
import java.time.LocalTime;

import vehicle.Vehicle;

public class Monthly extends Pass {
    private LocalDateTime expiry = LocalDateTime.now();
    private int price = 0;
    public Monthly(Vehicle vehicle, LocalTime inTime){
        super(vehicle,inTime);
    }
    public int getPrice() {
        String type = this.vehicle.getType();
        return type == "cycle" ? 50 : (type == "bike" ? 100 : 500);
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public LocalDateTime getExpiry() {
        return expiry.plusMonths(1);
    }
    public void setExpiry(LocalDateTime expiry) {
        this.expiry = expiry;
    }
}