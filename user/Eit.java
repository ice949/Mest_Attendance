package user;

public class Eit extends BaseUser {

    public Eit(String firstName, String lastName, String middleName, String email) {
        super(firstName, lastName, middleName, email);
    }

    @Override
    public boolean login(String email) {
        return(true);
    }
    
}
