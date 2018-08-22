package coffeePack.SeyferthCoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.jdbcintro.entity.Room;


@Controller
public class SeyferthCoffeeShopController { 

	@Autowired
	private UsersDao usersDao;
	
	@RequestMapping ("/")
	public ModelAndView showHomePage() {
		List<Item> items = usersDao.findAll();
		return new ModelAndView("foo", "items", items);

	}
	
	@RequestMapping("/registration-form")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("registrationform");
		return mav;
	}
	
	@RequestMapping("/summary")
	public ModelAndView showSummary(@RequestParam ("firstName") String firstName,
			@RequestParam ("lastName") String lastName,
			@RequestParam ("email") String email,
			@RequestParam ("phoneNumber") String phoneNumber,
			@RequestParam ("password") String password) {
		
		User user = new User();
		user.setId(null);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPhoneNumber(phoneNumber);
		user.setPassword(password);
		usersDao.create(user);
		
		ModelAndView mav = new ModelAndView("summary");
		mav.addObject("user", user);
		return mav;
	}
	
}
