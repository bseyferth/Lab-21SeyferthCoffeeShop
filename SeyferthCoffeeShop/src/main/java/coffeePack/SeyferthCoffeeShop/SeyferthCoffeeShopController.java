package coffeePack.SeyferthCoffeeShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SeyferthCoffeeShopController {

	@RequestMapping ("/")
	public ModelAndView showHomePage() {
		ModelAndView mav = new ModelAndView("foo");
		return mav;
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
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPhoneNumber(phoneNumber);
		user.setPassword(password);
		
		ModelAndView mav = new ModelAndView("summary");
		mav.addObject("user", user);
		return mav;
	}
	
}
