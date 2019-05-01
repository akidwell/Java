package Business;

public class Book  extends Product {

	private String author;

	public Book() {
		super();
	}

	public Book(String inCode, String inDescription, Double inPrice, String author) {
		super(inCode, inDescription, inPrice);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author +" " + super.toString() + "]";
	}
	
	
	
	
	
	
}
