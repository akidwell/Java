package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class CountryIO {

	private static ArrayList<String> countries = null;
	private static Path countriesPath = null;
	private static File countriesFile = null;
	private final static String FIELD_SEP = "\n";

	public CountryIO() {
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
		countries = this.getAll();
	}
	

	public static ArrayList<String> getAll() {
		if (countries != null) {
			return countries;
		}
		{
			countries = new ArrayList<>();

			if (Files.exists(countriesPath)) {
				try (BufferedReader in = new BufferedReader(new FileReader(countriesFile))) {

					String line = in.readLine();
					while (line != null) {
						String[] fields = line.split(FIELD_SEP);
						String countryName = fields[0];

						String c = new String(countryName);
						countries.add(c);

						line = in.readLine();
					}

				} catch (IOException e) {
					System.out.println(e);
					return null;
				}
			} else {
				System.out.println(countriesPath.toAbsolutePath() + "doesn't exist.");
				return null;
			}

			return countries;
		}
	}

	public String get(String countryName) {
		for (String c : countries) {
			if (c.toString().equals(countryName)) {
				return c;
			}
		}
		return null;
	}

	public boolean add(String c) {
		countries.add(c);
		return this.saveAll();
	}

	private boolean saveAll() {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile)))) {
			// write all products in the list to the file
			for (String c : countries) {
				out.println(c);
			}
			return true;
			
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}

	}
}