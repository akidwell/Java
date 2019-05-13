package com.prs.db;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.prs.business.User;

public  class UserDB {

	public static List<User> getAll() {
		List<User> users = null;
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		
		try {
			Query q = em.createQuery("Select u from User u");
			users = q.getResultList();
		} finally { 
			em.close();
		}
		
		return users;
	}
	
	public static boolean add (User u) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		try {
			em.persist(u);
			trans.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			trans.rollback();
		} finally {
			em.close();
		}
		return false;
	}
	
	public static boolean delete (User u) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try {
			em.remove(em.merge(u));
			trans.commit();
		} catch (Exception e) {
			System.out.println(e);
			trans.rollback();
		} finally { 
			em.close();
			
		}
		return true;
	}
	
	
	public static void update (User u) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin(); 
		try {
			em.merge(u);
			trans.commit();
		} catch (Exception e) {
			System.out.println(e);
			trans.rollback();
		} finally {
			em.close();
		}
	}
	
	public static User selectUser (String email) {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String qString = "SELECT u FROM User u " + 
		"Where u.email = :email";
		TypedQuery<User> q = em.createQuery(qString, User.class);
		q.setParameter("email", email);
		try { 
			User user = q.getSingleResult();
			return user;
		} catch (NoResultException e) {
			return null;
		} finally {
			em.close();
		}
	}
	
	public static boolean emailExists(String email) {
		User u = selectUser(email);
		return u != null;
	}
}
