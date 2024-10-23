package vehicle;

import user.User;

public class Car extends Vehicle {
    private String type = "car";
    public Car(String name, User user){
        super(name, user);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}