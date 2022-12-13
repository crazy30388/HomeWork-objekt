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

}
