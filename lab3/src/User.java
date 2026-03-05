public class User {

    private int id;
    private String email;
    private String passwordHash;
    private String name;
    private String phone;
    private Date createdAt;

    public boolean login() { return false; }
    public void logout() {}
    public void updateProfile() {}
}
