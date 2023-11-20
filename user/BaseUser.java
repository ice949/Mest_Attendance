package user;

import java.util.Date;
import java.util.UUID;

import subscription.BaseSubscription;

// BaseUser is an abstract class that represents a user of the system.
abstract class BaseUser {
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String authToken;
    private Date dateCreated;
    private BaseSubscription currentSubscription;

    // Constructor
    public BaseUser(String firstName, String lastName, String middleName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;

        // generate unique id and auth token and get current date
        this.authToken = UUID.randomUUID().toString();
        this.id = UUID.randomUUID().toString();
        this.dateCreated = new Date();
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthToken() {
        return authToken;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Abstract login method to be implemented by child classes

    public abstract boolean login(String email);

}