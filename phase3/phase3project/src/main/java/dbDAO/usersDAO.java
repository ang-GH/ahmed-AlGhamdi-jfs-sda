package dbDAO;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entitys.shoes;
import entitys.users;

public class usersDAO {
	
	public List<users> showUsers() {
		
		Configuration cfg = new Configuration().configure();
		

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		TypedQuery q = session.createQuery("select u from entitys.users u", users.class);

		List<users> users = q.getResultList();

		session.close();
		factory.close();

		return users;

	}
	
	public users getUserById(int id) {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		TypedQuery q = session.createQuery("select u from entitys.users u", users.class);

		List<users> users = q.getResultList();

		session.close();
		factory.close();
		for (users u : users) {
			if (u.getId() == id) {
				return u;
			}
		}
		return null;

	}
	
	public void editUserById(int id,String name,String password ) {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		users user = session.get(users.class, id);
		user.setUserName(name);
		user.setPassword(password);
		
		
		Transaction tx = session.beginTransaction();
		session.update(user);
		tx.commit();
		
		session.close();
		factory.close();

	}
	
	public users userLogin(String name,String password) {
		Configuration cfg = new Configuration().configure();
		System.out.println("test 1");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println("test 2");
		Session session = factory.openSession();

		TypedQuery q = session.createQuery("select u from entitys.users u", users.class);

		List<users> users = q.getResultList();

		session.close();
		factory.close();
		for (users u : users) {
			if (u.getUserName().equals(name)&&u.getPassword().equals(password)) {
				return u;
			}
		}
		return null;
	}

}
