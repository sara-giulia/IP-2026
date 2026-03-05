import java.util.List;

public class Admin extends User {

    private String role;
    private List<String> permissions;

    public void manageUsers() {}
    public void moderateContent() {}
    public Report generateReport() { return null; }
    public void configurePromotion() {}
}
