package coffeePack.SeyferthCoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class UsersDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public List<Item> findAll(){
		String sql = "SELECT * FROM items";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Item.class));
	}
	
	public void create(User user) {
		String sql="INSERT INTO users (first_name, last_name, email, phone_number, password) VALUES (?,?,?,?,?)";
		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhoneNumber(), user.getPassword());
		
	}
	
}