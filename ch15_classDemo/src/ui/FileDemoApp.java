package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import business.Product;

public class FileDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the File Demo App");

		try {
			// define a folder on the harddrive
			String dirString = "c:/temp";
			Path dirPath = Paths.get(dirString);
			if (Files.notExists(dirPath)) {
				Files.createDirectories(dirPath);
				System.out.println("Directory successfully added");
			} else {
				System.out.println("Directory already exists");
			}
			
			//define a file within the folder
			String fileString = "Prodcts.txt";
			Path filePath = Paths.get(dirString, fileString);
			if (Files.notExists(filePath)) {
				Files.createFile(filePath);
				System.out.println(fileString+ "successfully created");
			}
			else {
				System.out.println(fileString + "not created");
			}
			
			System.out.println("file name: " + filePath.getFileName());
			System.out.println("Absolute Path: " + filePath.toAbsolutePath());
			System.out.println("is writable: " + Files.isWritable(filePath));
			System.out.println(filePath.toString());
			
			//print file infor from directory
			System.out.println("Files in a directory ");
			if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
				System.out.println("Directory " + dirPath.toAbsolutePath());
				System.out.println("Files: ");
				DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
				for (Path p: dirStream) {
					if (Files.isRegularFile(p)) {
					System.out.println("     "+ p.getFileName());
					}
				}
			}
			// write to the file
			Path productsPath = Paths.get("products.txt");
			//Note, this is not the same products.txt as the examples above
			File productsFile = productsPath.toFile();
			//open an optput stream
			PrintWriter out = new PrintWriter(
							  new BufferedWriter (
							  new FileWriter(productsFile)));
			
			// Write data to the stream
			out.println("Java\tMurach's Java programming \t 57.50");
			// close the stream to avoid a resource leak
			out.close();
			
			BufferedReader in = new BufferedReader(
								new FileReader(productsFile));
			// read data from the stream and print to console
			//object relational mapping
			String line = in.readLine();
			System.out.println(line);
			
			//bonus instruction - map this line to a product
			String[] fields = line.split("\t");
			String code = fields[0];
			String description = fields[1];
			double price = Double.parseDouble(fields[2]);
					
			Product p = new Product(code, description, price);
			System.out.println(p);
			
			// close input stream and free system resources
			in.close();
			
		} catch (IOException e) {
			System.out.println("Bad directory path entered");
			e.printStackTrace();
		}

		System.out.println("Bye");

	}

}
