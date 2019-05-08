package db;

import java.util.List;

public interface DAO<T> {//T is just generic, define in product text file
	
	T get(String code);	//read method
	List<T> getAll();  // read method- list of all products
	boolean add(T t); 	// add product T= type, t = variable name
	boolean update (T t);
	boolean delete (T t);
						// crud methods
}
