package com.dmdb;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dmdb.business.Actor;
import com.dmdb.business.Movie;
import com.dmdb.db.ActorDB;
import com.dmdb.db.MovieDB;
import com.dmdb.util.Console;


@SpringBootApplication
public class DmdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmdbApplication.class, args);
		displayMenu();
		String action = " ";
		while (!action.equalsIgnoreCase("exit")) {
			action = Console.getRequiredString("enter a command:  ");

			if (action.equalsIgnoreCase("actors")) {
				displayAllActors();
				
			} else if (action.equalsIgnoreCase("movies")) {
				displayAllMovies();

			} else if (action.equalsIgnoreCase("")) {
				
				
			} else if (action.equalsIgnoreCase("")) {
				

			} else if (action.equalsIgnoreCase("")) {
			
				
			} else if (action.equalsIgnoreCase("help")) {
				displayMenu();

			} else {
				System.out.println("invalid command");
			}
		}

		System.out.println("bye");
	}

	public static void displayMenu() {
		System.out.println("command menu:");
		System.out.println("==============");
		System.out.println("actors- list all actors");
		System.out.println("movies- list all movies");
		
		

	}

	private static void displayAllActors() {
		System.out.println("Actor list:  ");
		System.out.println("================");
		List<Actor> actors = ActorDB.getAll();
			if (actors!=null) {
				
					System.out.println(actors);
				}
			
			else  {
				System.out.println("actors null");
			}
		
	}
			
			private static void displayAllMovies() {
				System.out.println("Movie list:  ");
				System.out.println("================");
				List<Movie> movies = MovieDB.getAll();
					if (movies!=null) {
						
							System.out.println(movies);
						}
					
					else  {
						System.out.println("movies null");
				
			}
	}
}

