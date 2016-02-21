package application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@RequestMapping("/hello")
	public String index(){
		return "Hello world!";
		
	}
	
}
