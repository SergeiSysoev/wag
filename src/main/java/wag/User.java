package wag;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String invalidEmail;
    private String phone;


    public User(String firstName, String lastName, String password, String email, String phone, String invalidEmail){
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.invalidEmail = invalidEmail;
        this.phone = phone;

    }

    public String getFirstName(){
        return firstName;
    }public String getLastName(){
        return lastName;
    }public String getPassword(){
        return password;
    }public String getEmail(){
        return email;
    }public String getPhone(){
        return phone;
    }
    public String getInvalidEmail(){
        return invalidEmail;
    }
}
