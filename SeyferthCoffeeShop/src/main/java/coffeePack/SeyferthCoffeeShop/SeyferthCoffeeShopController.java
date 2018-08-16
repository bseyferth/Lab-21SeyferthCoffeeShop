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
	public ModelAndView showSummary(@RequestParam ("firstName") String firstName) {
		ModelAndView mav = new ModelAndView("summary");
		mav.addObject("firstName", firstName);
		return mav;
	}
	
}
