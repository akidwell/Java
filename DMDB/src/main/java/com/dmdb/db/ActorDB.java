package com.dmdb.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dmdb.business.Actor;


public class ActorDB {
		public static List<Actor> getAll() {
			List<Actor> actors = null;
			EntityManager em = DBUtil.getEmFactory().createEntityManager();
			
			try {
				Query q = em.createQuery("Select a from Actor a");
				actors = q.getResultList();
			} finally { 
				em.close();
			}
			
			return actors;

}
	}

