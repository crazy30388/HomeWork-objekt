import java.util.Objects;

public class Book {
    private String name;

    private String author;

    private int theYearOfPublishing;

    public Book (String name, String author, int theYearOfPublishing){
        this.name = name;
        this.author = author;
        this.theYearOfPublishing = theYearOfPublishing;

    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getTheYearOfPublishing(){

        return this.theYearOfPublishing;
    }
    public void setTheYearOfPublishing(int theYearOfPublishing) {

        this.theYearOfPublishing = theYearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return theYearOfPublishing == book.theYearOfPublishing && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, theYearOfPublishing);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", theYearOfPublishing=" + theYearOfPublishing +
                '}';
    }
}
