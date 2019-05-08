package db;

import java.io.*; //imports all *
import java.nio.file.*; //just tells java to look at the packages to look up the classes
import java.util.ArrayList;
import java.util.List;

import business.Product;

public class ProductTextFile implements DAO<Product> {
	// add instance variables first
	private List<Product> products = null; // just initalized to null?
	private Path productsPath = null; // have to import Path
	private File productsFile = null; // have to import File
	private final String FIELD_SEP = "\t";

	public ProductTextFile() { // default constructor = doesn't use any of the fields, then create them.
		// define the path to the file. when new keyword gets called, constructor gets
		// called.
		productsPath = Paths.get("products.txt"); // relative path
		// define the file, then converts it to a java file
		productsFile = productsPath.toFile();
		// initalize our list of products
		products = getAll();

	}

	@Override
	public Product get(String code) {
		for (Product p : products) {
			if (p.getCode().equalsIgnoreCase(code)) {
				return p;
			}
		}
		return null;
	}

	@Override // always do this one first
	public List<Product> getAll() {
		// if products file has already been read, don't read it again
		// if this app supported multiple users, this might be dangerous...
		if (products != null) {
			return products; // if something in products, just return. products not null
		}

		products = new ArrayList<Product>(); // created empty array list. don't have to have product in <>
		if (Files.exists(productsPath)) { // only do the rest of this code if the product does exist
			try (BufferedReader in = new BufferedReader(new FileReader(productsFile))) {
				// read a line from a products.txt
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					String code = fields[0];
					String desc = fields[1];
					double price = Double.parseDouble(fields[2]);

					Product p = new Product(code, desc, price);// creates instance of product
					products.add(p);// adds to array list

					line = in.readLine(); // calls the next line in the file, continues until file is empty

				}
			}
//This was auto generated IOexception will handle it
//			catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace(); 

			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println(productsPath.toAbsolutePath() + "Does not exist");
			return null;
		}
		return products;
	}

	@Override
	public boolean add(Product t) {
		products.add(t);
		return this.saveAll();
	}

	@Override
	public boolean delete(Product t) {
		products.remove(t);
		return saveAll();
	}

	// when processing text files we will re-save
	// the entire file everytime we add, update, delete
	private boolean saveAll() {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)))) {
			// loop through products list and
			// write a record for every product
			for (Product p : products) {
				out.print(p.getCode() + FIELD_SEP);
				out.print(p.getDescription() + FIELD_SEP);
				out.println(p.getPrice());

			}
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Product t) {
		// TODO Auto-generated method stub
		return false;
	}
}
