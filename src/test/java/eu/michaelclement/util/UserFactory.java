package eu.michaelclement.util;

import eu.michaelclement.data.User;

public class UserFactory {
    public static User getUser(UserType userType) {
        switch (userType) {
            case VALID_USER -> {
                return new User("practiceUser", "practicePass");
            }
            case INVALID_PASSWORD_USER -> {
                return new User("practiceUser", "invalidPass");
            }
            case INVALID_USERNAME_USER -> {
                return new User("invalidUser", "practicePass");
            }
            default -> throw new RuntimeException();
        }
    }
}
