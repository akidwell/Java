package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class MovieCollection {

	private List<Movie> movieList;


	public MovieCollection(List<Movie> movieList) {
		super();
		this.movieList = movieList;
	}
		
		public MovieCollection() {
			movieList = new ArrayList<>();
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	@Override
	public String toString() {
		return "MovieCollection [movieList=" + movieList + "]";
	}
	
	public void add(Movie m) {
		movieList.add(m);
        
	}
	
	public List<Movie> filterMovies (Predicate<Movie> condition) {
    	List<Movie> getMovies = new ArrayList<>();
    	for(Movie m : movieList) {
    		if (condition.test(m)) {
    			getMovies.add(m);
    		}

    	}
    	return getMovies;
    	
	}
	
	public double getLowestRating() {
		double lowestRating = movieList.stream()
				.map(m -> m.getRating())
				.reduce(5.0, (a,b) -> Math.min(a, b));
		return lowestRating;
		
	}
	
	public double gethighestRating() {
		double highestRating = movieList.stream()
				.map(m -> m.getRating())
				.reduce(0.0, (a,b) -> Math.max(a, b));
		return highestRating;			
	}
	
	public double getAverageRating() {
		double sum = movieList.stream()
		.map(m -> m.getRating())
		.reduce(0.0, (a,b) -> (a+b));
		double averageRating = sum / movieList.size();
		return averageRating;
		
	}
	
	public int getSize() {
		return movieList.size();
		
	}
	}
