public class Main {
    public static void main(String[] args) {
        Book book = new Book("Финансист","Теодор Драйзер",1912);
        Autor author = new Autor("Теодор"," Драйзер");
        System.out.println("Название книги = " + book.getNameBook());
        System.out.println("Автор = " + author.getAuthor());
        System.out.println("Год публикации = " + book.getTheYearOfPublishing() + " год");
        System.out.println("  ");
        Book book1 = new Book("Атлант расправил плечи","Айн Рэнд",1957);
        Autor author1 = new Autor("Айн"," Рэнд");
        book1.setTheYearOfPublishing(1964);
        System.out.println("Название книги = " + book1.getNameBook());
        System.out.println("Автор = " + author1.getAuthor());
        System.out.println("Год публикации = " + book1.getTheYearOfPublishing() + " год");
    }
}
