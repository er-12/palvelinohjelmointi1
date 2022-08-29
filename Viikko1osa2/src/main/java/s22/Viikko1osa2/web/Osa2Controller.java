package s22.Viikko1osa2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Osa2Controller {
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHelloToSomeone(@RequestParam(name="location") String paikka, @RequestParam(name="name") String nimi) {
		return "Welcome to the " + paikka + " " + nimi + "!";
	}

}
