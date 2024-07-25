package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.User;

public class UserDao {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("gowri");
	EntityManager em =emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	public void save(User user) {
		et.begin();
		em.persist(user);
		et.commit();
	}
	public User find(String email) {
		Query q=em.createQuery("select a from User a where email=?1");
		q.setParameter(1, email);
		User u=(User) q.getSingleResult();
		return u;
	}
	public User find(int id) {
		User u=em.find(User.class, id);
		return u;
	}
	public List<User> allUser() {
		Query q=em.createQuery("select a from User a");
		List<User> l=q.getResultList();
		return l;
	}
}
