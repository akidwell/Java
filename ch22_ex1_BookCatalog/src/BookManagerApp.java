import java.util.List;

public class BookManagerApp {

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        
        
		List<Book> getBookByTitle = manager.getBooks(b -> b.getTitle().contains("Java"));
		System.out.println("\nBOOKS BY TITLE:");
		printList(getBookByTitle);
        
//        List<Book> booksByTitle = manager.getBooksByTitle("Java Programming");
//        System.out.println("\nBOOKS BY TITLE:");
//        printList(booksByTitle);
		
		List<Book> getBookByCategory = manager.getBooks(b2 -> b2.getCategory().equals("Java"));
		System.out.println("\nBOOKS BY Category:");
		printList(getBookByCategory);
        
//        List<Book> booksByCategory = manager.getBooksByCategory(Book.JAVA);
//        System.out.println("\nBOOKS BY CATEGORY:");
//        printList(booksByCategory);
		
		List<Book> getBookByFormat = manager.getBooks(b3 -> b3.getFormat().equals("Paperback"));
		System.out.println("\nBOOKS BY Format:");
		printList(getBookByFormat);
        
//        List<Book> booksByFormat = manager.getBooksByFormat(Book.PAPERBACK);
//        System.out.println("\nBOOKS BY FORMAT:");
//        printList(booksByFormat);
        
    }
    
    public static void printList(List<Book> bookList) {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
};