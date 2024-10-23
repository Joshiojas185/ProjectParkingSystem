package pass;

import java.time.LocalDateTime;
import java.time.LocalTime;

import vehicle.Vehicle;

public class Pass {
    private String id = "Pass-" + LocalDateTime.now();
    private LocalTime inTime;

    public LocalTime getInTime() {
        return inTime;
    }

    protected Vehicle vehicle = null;
    private LocalDateTime expiry = LocalDateTime.now();
    public Pass(Vehicle vehicle, LocalTime inTime){
        this.vehicle = vehicle;
        this.inTime = inTime;
    }

    public String toString() {
        String toPrint = "Pass Id : " + this.id;
        toPrint += "\nVehicle : " + this.vehicle.getName();
        toPrint += "\nOwner : " + this.vehicle.getOwner().getName();
        toPrint += "\nExpiry : " + this.getExpiry();

        return toPrint;
    }

    public LocalDateTime getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDateTime expiry) {
        this.expiry = expiry;
    }
}