package vehicle;

import java.time.LocalDateTime;

import user.User;

public abstract class Vehicle {
    private String id = "Vehicle-" + LocalDateTime.now();
    private String name = "Unknown";
    private User owner = null;
    private String type = null;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public User getOwner() {
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
    Vehicle(String name, User user){
        this.name = name;
        this.owner = user;
    }
}