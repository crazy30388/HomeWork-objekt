public class Autor {
    private String firstName;
    private String lastName;

    private String name;

    public Autor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return this.name;
    }
}
