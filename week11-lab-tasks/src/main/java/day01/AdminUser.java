package day01;

public class AdminUser implements User {
    private String email, password;

    public AdminUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getUserEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            sb.append("*");
        }
        return sb.toString();
    }
}
