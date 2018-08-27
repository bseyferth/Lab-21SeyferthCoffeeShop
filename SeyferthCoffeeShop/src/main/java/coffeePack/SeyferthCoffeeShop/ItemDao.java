package coffeePack.SeyferthCoffeeShop;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class ItemDao {
	
	@PersistenceContext
	private EntityManager em;
	
	
	public List<Item> findAll(){
		return em.createQuery("FROM Item", Item.class).getResultList();
	}
	
	public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		Item item = em.getReference(Item.class, id);
		em.remove(item);
	}
	
	public void create(Item item) {
		em.persist(item);
	}
	
	public Item findById(Long id) {
		return em.find(Item.class, id);
	}

	public void update(Item item) {
		em.merge(item);
	}
}
