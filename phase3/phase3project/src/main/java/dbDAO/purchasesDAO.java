package dbDAO;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entitys.purchases;
import entitys.shoes;

public class purchasesDAO {

	public List<purchases> showPurchases() {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		TypedQuery q = session.createQuery("select u from entitys.purchases u", purchases.class);

		List<purchases> purchases = q.getResultList();

		session.close();
		factory.close();

		return purchases;

	}
	public void addPurchase(int userId ,int shoeId) {

		Configuration cfg = new Configuration().configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		purchases purchase = new purchases();
		purchase.setUserId(userId);
		purchase.setShoeId(shoeId);
		
		
		Transaction tx = session.beginTransaction();
		session.save(purchase);
		tx.commit();
		
		session.close();
		factory.close();

	}
}
