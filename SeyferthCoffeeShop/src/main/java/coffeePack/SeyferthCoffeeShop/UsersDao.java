package coffeePack.SeyferthCoffeeShop;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsersDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void create(User user) {		
		em.persist(user);
	}
	
}