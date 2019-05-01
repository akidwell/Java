package UserInterface;
import Business.Book;
import Business.Product;

public class ProductDemoApp {

	public static void main(String[] args) {
		System.out.println("Hello product demo app");
		
//		Product product1 = new Product("java", "Murachs Java Programming", 57.50);
//		Product product2= new Product("MySQL", "Murach's mySQL", 54.50);
//		
//		
//		
//		System.out.println(product1.getCode() + " " +product1.getDescription()+" "+ product1.getPrice());
//		System.out.println(product2.toString());
		System.out.println("bye");
		
		
		//Create book
		
		Book ambersBook = new Book("java","Murachs java programming",
				57.5, "joel murach");
		System.out.println(ambersBook);
		
		
	Product.aStaticMethod();

	}

}
