package dbDAO;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entitys.shoes;

public class shoesDAO {

	public List<shoes> showShoes() {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		TypedQuery q = session.createQuery("select u from entitys.shoes u", shoes.class);

		List<shoes> shoes = q.getResultList();

		session.close();
		factory.close();

		return shoes;

	}

	public shoes getShoeById(int id) {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		TypedQuery q = session.createQuery("select u from entitys.shoes u", shoes.class);

		List<shoes> shoes = q.getResultList();

		session.close();
		factory.close();
		for (shoes s : shoes) {
			if (s.getShoeId() == id) {
				return s;
			}
		}
		return null;

	}

	public void editShoeById(int id,String name,String description ,int price) {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		shoes shoe = session.get(shoes.class, id);
		shoe.setShoeName(name);
		shoe.setDescription(description);
		shoe.setPrice(price);
		
		Transaction tx = session.beginTransaction();
		session.update(shoe);
		tx.commit();
		
		session.close();
		factory.close();

	}
	
	public void addShoe(String name,String description ,int price) {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		shoes shoe = new shoes();
		shoe.setShoeName(name);
		shoe.setDescription(description);
		shoe.setPrice(price);
		
		Transaction tx = session.beginTransaction();
		session.save(shoe);
		tx.commit();
		
		session.close();
		factory.close();

	}
	
	public void deleteShoeById(int id) {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		shoes shoe = session.get(shoes.class, id);
		
		
		Transaction tx = session.beginTransaction();
		session.delete(shoe);
		tx.commit();
		
		session.close();
		factory.close();System.out.println(id);

	}

}
