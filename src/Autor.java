import java.util.Objects;

public class Autor {
    private String firstName;
    private String lastName;

    private String autor;

    public Autor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.autor = firstName + lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getAutor(){
        return this.autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(firstName, autor.firstName) && Objects.equals(lastName, autor.lastName) && Objects.equals(autor, autor.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, autor);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", name='" + autor + '\'' +
                '}';
    }



}
