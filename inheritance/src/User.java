public class User {

    protected static long id;
    protected static String firstName;
    protected static String lastName;
    String gender;
    String email;
    // add rest of the variables

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    // add rest of the getters & setters

    // firstName
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // lastName
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // gender
    public String getGender(){
        return gender;
    }
    public  void setGender(String gender){
        this.gender = gender;
    }

    // email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
