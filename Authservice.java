package BookingSystem;

import BookingSystem.User;

public class AuthService {
    private User user;

    public void register(String u, String p) {
        user = new User(u, p);
        System.out.println("Registered!");
    }

    public boolean login(String u, String p) {
        return user != null &&
               user.username.equals(u) &&
               user.password.equals(p);
    }
}
