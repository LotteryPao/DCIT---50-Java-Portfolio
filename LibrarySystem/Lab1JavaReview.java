import java.util.Scanner;

public class Lab1JavaReview {

    // Global variables so all methods can access them
    // Array limit is 5 as per instructions
    static String[] bookTitles = new String[5];
    static String[] bookStatus = new String[5];
    static int bookCount = 0; // To keep track of how many books we have
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            // 1. Display the Main Menu
            System.out.println("\n--- Campus Library System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book Status");
            System.out.println("3. Show All Books");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            
            // 6. Handle Invalid Menu Selections using switch-case
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    updateBookStatus();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    generateReport();
                    break;
                case 5:
                    // 7. Exit the Program
                    System.out.println("Exiting system. Goodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Error: Invalid choice. Please try again.");
            }
        }
    }

    // 2. Add a New Book
    public static void addBook() {
        if (bookCount < 5) {
            sc.nextLine(); // Clear the buffer line
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            bookTitles[bookCount] = title;
            bookStatus[bookCount] = "Available"; // Default status
            
            bookCount++; // Increase the count
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Error: Library is full (Max 5 books).");
        }
    }

    // 3. Update Book Status
    public static void updateBookStatus() {
        // Show books first so user knows the number
        showBooks();

        if (bookCount == 0) {
            return; // Stop if no books
        }

        System.out.print("Enter Book Number to update: ");
        int bookNum = sc.nextInt();
        int index = bookNum - 1; // Convert to array index (0-4)

        // Check if index is valid
        if (index >= 0 && index < bookCount) {
            String currentStatus = bookStatus[index];
            
            // Toggle status logic
            if (currentStatus.equals("Available")) {
                bookStatus[index] = "Borrowed";
                System.out.println("Status updated to: Borrowed");
            } else {
                bookStatus[index] = "Available";
                System.out.println("Status updated to: Available");
            }
        } else {
            System.out.println("Error: Invalid book number.");
        }
    }

    // 4. Display All Books
    public static void showBooks() {
        System.out.println("\n--- Book List ---");
        if (bookCount == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                // Display format: 1. Title - Status
                System.out.println((i + 1) + ". " + bookTitles[i] + " - " + bookStatus[i]);
            }
        }
    }

    // 5. Generate a Simple Book Report
    public static void generateReport() {
        int availableCount = 0;
        int borrowedCount = 0;

        // Loop to count stats
        for (int i = 0; i < bookCount; i++) {
            if (bookStatus[i].equals("Available")) {
                availableCount++;
            } else {
                borrowedCount++;
            }
        }

        System.out.println("\n--- Library Report ---");
        System.out.println("Total Books Registered: " + bookCount);
        System.out.println("Total Available: " + availableCount);
        System.out.println("Total Borrowed: " + borrowedCount);
    }
}