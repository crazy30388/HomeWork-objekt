public class Main {
    public static void main(String[] args) {
        Book book = new Book("Финансист","Теодор Драйзер",1912);
        Autor autor = new Autor("Теодор"," Драйзер");
        System.out.println("Название книги = " + book.getNameBook());
        System.out.println("Автор = " + autor.getAutor());
        System.out.println("Год публикации = " + book.getTheYearOfPublishing() + " год");
        System.out.println("  ");
        Book book1 = new Book("Атлант расправил плечи","Айн Рэнд",1957);
        Autor autor1 = new Autor("Айн"," Рэнд");
        book1.setTheYearOfPublishing(1964);
        System.out.println("Название книги = " + book1.getNameBook());
        System.out.println("Автор = " + autor1.getAutor());
        System.out.println("Год публикации = " + book1.getTheYearOfPublishing() + " год");
    }
}
