package user;

public class AdminUser extends BaseUser {

    public AdminUser(String firstName, String lastName, String middleName, String email) {
        super(firstName, lastName, middleName, email);
    }

    @Override
    public boolean login(String email) {
        return(true);
    }
    
}
