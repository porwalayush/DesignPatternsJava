package Creational.Prototype;

public class Main {
    interface Prototype{
        Prototype getClone();
    }

    static class Book implements Prototype{
        String bookName;
        int noOfPages;
        public Book(String bookName, int noOfPages) {
            this.bookName = bookName;
            this.noOfPages = noOfPages;
        }

        @Override
        public Prototype getClone() {
            return new Book(bookName, noOfPages);
        }
        @Override
        public String toString() {
            return "Book [name=" + bookName + ", No of pages =" + noOfPages + "]";
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", 150);
        Book book2 = (Book) book1.getClone();

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
