package se.enchanted.rest;

import java.net.URI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import se.enchanted.entity.ViewedMovieEntity;
import se.enchanted.util.HibernateUtil;

@RestController
@Service
public class ViewedMovie {

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<String> createViewedMovie(@RequestBody ViewedMovieEntity vmMovie) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		ViewedMovieEntity movie = vmMovie;
		session.save(movie);
		session.getTransaction().commit();
		session.close();

		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

}
