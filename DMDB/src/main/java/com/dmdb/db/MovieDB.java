package com.dmdb.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dmdb.business.Movie;

public class MovieDB {
		public static List<Movie> getAll() {
			List<Movie> movies = null;
			EntityManager em = DBUtil.getEmFactory().createEntityManager();
			
			try {
				Query q = em.createQuery("Select m from Movie m");
				movies = q.getResultList();
			} finally { 
				em.close();
			}
			
			return movies;

}

}
