package DB;
import Business.Product;

public interface ProductReader {
	Product get(String Code);
	String getAll(); //returns a string
}
