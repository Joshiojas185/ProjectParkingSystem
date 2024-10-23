package user;

public class Faculty extends User {
    private String role = "faculty";
    public Faculty(String name, String contact){
        super(name, contact);
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}