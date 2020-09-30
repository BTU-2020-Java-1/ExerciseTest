package ge.edu.btu.store;

import ge.edu.btu.model.User;

public class UserStore {

    private User[] users = new User[100];

    private int usersAmount;

    public void addUser(User user) {
        users[usersAmount] = user;
        usersAmount++;
    }

    public boolean existsByUsername(String username) {
        for (int i = 0; i < usersAmount; i++) {
            User user = users[i];
            if (username.equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }
}
