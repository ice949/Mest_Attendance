package user;

import java.util.Date;

// BaseUser is an abstract class that represents a user of the system.
abstract class BaseUser {
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String authToken;
    private Date dateCreated;

    // Constructor
    public BaseUser(String id, String firstName, String lastName, String middleName, String email, String authToken, Date dateCreated) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.authToken = authToken;
        this.dateCreated = dateCreated;
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

}