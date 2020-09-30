package ge.edu.btu.service;

import ge.edu.btu.model.RegistrationException;
import ge.edu.btu.model.User;
import ge.edu.btu.store.UserStore;

public class UserServiceImpl implements UserService {

    private UserStore userStore = new UserStore();

    @Override
    public void addUser(String username, String password1, String password2) throws RegistrationException {
        if (!password1.equals(password2)) {
            throw new RegistrationException("Passwords not equal");
        }
        if (userStore.existsByUsername(username)) {
            throw new RegistrationException("User with this username already exists");
        }
        User user = new User(username, password1);
        userStore.addUser(user);
        System.out.println("მომხმარებელი წარმატებით დაემატა");
    }
}
