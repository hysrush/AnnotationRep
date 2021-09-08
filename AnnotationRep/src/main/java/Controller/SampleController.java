package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/sample/*")
public class SampleController {

	@RequestMapping("")
	public void basic() {
		System.out.println("basic................");
	}
	
	@RequestMapping(value="/basic" ,method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		System.out.println("basic get.................");
	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		System.out.println("basic get only get.................");
	}
}
