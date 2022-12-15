public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Теодор"," Драйзер");
        Book book = new Book("Финансист", autor,1912);
        System.out.println("Название книги = " + book.getNameBook());
        System.out.println("Автор = " + autor.getAutor());
        System.out.println("Год публикации = " + book.getTheYearOfPublishing() + " год");
        System.out.println("  ");
        Autor autor1 = new Autor("Айн"," Рэнд");
        Book book1 = new Book("Атлант расправил плечи",autor1,1957);
        book1.setTheYearOfPublishing(1964);
        System.out.println("Название книги = " + book1.getNameBook());
        System.out.println("Автор = " + autor1.getAutor());
        System.out.println("Год публикации = " + book1.getTheYearOfPublishing() + " год");
    }
}
