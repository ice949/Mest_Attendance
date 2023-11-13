package user;

public class KitchenUser extends BaseUser {

    public KitchenUser(String firstName, String lastName, String middleName, String email) {
        super(firstName, lastName, middleName, email);
    }

    @Override
    public boolean login(String email) {
        return(true);
    }
    
}
