package vehicle;

import user.User;

public class Cycle extends Vehicle {
    private String type = "cycle";
    Cycle(String name, User user){
        super(name, user);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}