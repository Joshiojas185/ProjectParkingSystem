package user;

public class Student extends User {
    private String role = "student";
    public Student(String name, String contact){
        super(name, contact);
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}