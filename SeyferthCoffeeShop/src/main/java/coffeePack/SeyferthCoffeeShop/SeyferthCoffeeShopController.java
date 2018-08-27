package coffeePack.SeyferthCoffeeShop;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.foodsorm.entity.Food;



@Controller
public class SeyferthCoffeeShopController { 

	@Autowired
	private UsersDao usersDao;
	@Autowired
	private ItemDao itemDao;
	
	@RequestMapping ("/")
	public ModelAndView showHomePage() {
		List<Item> items = itemDao.findAll();
		return new ModelAndView("foo", "item", items);
	}
	
	@RequestMapping ("/admin")
	public ModelAndView showAdminPage() {
		List<Item> items = itemDao.findAll();
		return new ModelAndView("admin", "item", items);
	}
	
	@RequestMapping ("/edititem")
	public ModelAndView editItemPage(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("edititem");
		mav.addObject("item", itemDao.findById(id));
		return mav;
	}
	
	@RequestMapping("/editanitem")
	public ModelAndView submitEditForm(Item item) {
		itemDao.update(item);
		return new ModelAndView("redirect:/admin");
	}
	
	
	@RequestMapping ("/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("delete");
		mav.addObject("id",id);
		return mav;
	}
	
	@RequestMapping ("/delete-item")
	public ModelAndView deleteitem(@RequestParam("id") Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		itemDao.delete(id);
		return new ModelAndView("redirect:/admin");
	}
	
	@RequestMapping("/registration-form")
	public ModelAndView showForm() {
		ModelAndView mav = new ModelAndView("registrationform");
		return mav;
	}
	
	@RequestMapping("/add-item")
	public ModelAndView showItemForm() {
		ModelAndView mav = new ModelAndView("itemform");
		return mav;
	}
	
	@RequestMapping("/addanitem")
	public ModelAndView addItem(Item item) {
			itemDao.create(item);
			return new ModelAndView("redirect:/admin");
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
