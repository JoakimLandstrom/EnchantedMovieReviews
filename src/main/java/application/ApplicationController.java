package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.MovieViewed;

@RestController
public class ApplicationController {

	@RequestMapping("/create")
	public String index(){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		MovieViewed movie = new MovieViewed(0, "Bob is nice", 1, 0, "WOw nice movie!");
		session.save(movie);
		session.getTransaction().commit();
		session.close();
		
		return "Hello world!";
	}
	
}
