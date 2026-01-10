// MyBookList.java Main program
public class MyBookList {
    public static void main(String[] args) {
        // 1. To create books
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book("Java Programming", "John Doe", 2020);
        // Favorite book
        Book book5 = new Book("History of the Filipino People", "Teodoro Agoncillo", 1960);

        // 2. To display details of each book
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();

        System.out.println("\n--- After changing pages ---");
        // 3. To change current page of some books
        book1.changePage(50);
        book3.changePage(100);

        book1.displayDetails();
        book3.displayDetails();

        System.out.println("\n--- Favorite book updated ---");
        // 4. To change current page of favorite book
        book5.changePage(150);
        book5.displayDetails();

        System.out.println("\n--- Author change ---");
        // 5. To change author of "Java Programming"
        book4.changeAuthor("Jane Smith");
        book4.displayDetails();

        System.out.println("\n--- Books published after 2010 ---");
        // 6. Array and display for books after 2010
        Book[] bookArray = { book1, book2, book3, book4, book5 };

        for (Book b : bookArray) {
            if (b.getYearPublished() > 2010) {
                System.out.println(b.getTitle());
            }
        }
    }
}