package ge.edu.btu;

import ge.edu.btu.model.RegistrationException;
import ge.edu.btu.service.UserService;
import ge.edu.btu.service.UserServiceImpl;

public class Runner {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        try {
            userService.addUser("Test User", "test", "tets");
        } catch (RegistrationException ex) {
            System.out.println("მომხმარებლის დამატება ვერ მოხერხდა: " + ex.getMessage());
        }
        try {
            userService.addUser("Test User", "test", "test");
        } catch (RegistrationException ex) {
            System.out.println("მომხმარებლის დამატება ვერ მოხერხდა: " + ex.getMessage());
        }
        try {
            userService.addUser("Test User", "test", "test");
        } catch (RegistrationException ex) {
            System.out.println("მომხმარებლის დამატება ვერ მოხერხდა: " + ex.getMessage());
        }
    }
}
