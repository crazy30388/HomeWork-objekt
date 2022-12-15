import java.util.Objects;

public class Book {
    private String nameBook;

    private String autor;

    private int theYearOfPublishing;

    public Book (String nameBook, String author, int theYearOfPublishing){
        this.nameBook = nameBook;
        this.autor = author;
        this.theYearOfPublishing = theYearOfPublishing;

    }
    public String getNameBook(){
        return this.nameBook;
    }
    public String getAuthor(){
        return this.autor;
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
        return theYearOfPublishing == book.theYearOfPublishing && Objects.equals(nameBook, book.nameBook) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, autor, theYearOfPublishing);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + nameBook + '\'' +
                ", author='" + autor + '\'' +
                ", theYearOfPublishing=" + theYearOfPublishing +
                '}';
    }

}
