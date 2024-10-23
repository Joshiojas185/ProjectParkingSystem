package user;

import java.time.LocalDateTime;

public abstract class User {
    private String id = null;
    private String name = "Unknown";
    private String contact = "0000000000";

    User(String name, String contact){
        this.id = "User-" + LocalDateTime.now();
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }
}