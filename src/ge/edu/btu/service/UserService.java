package ge.edu.btu.service;

import ge.edu.btu.model.RegistrationException;

public interface UserService {

    void addUser(String username, String password1, String password2) throws RegistrationException;
}
