package san.com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //This must be used to define it is a controller
public class HomeController {

	@RequestMapping(value = "/")   //when url with / on default GET is called, it will show just string due to
	//ResponseBody annotation to display only string
	public @ResponseBody String chkUser2() {
		return "index page is called";
    }
	
	@RequestMapping(value = "/hello",method=RequestMethod.GET)  //  /hello url will call hello.jsp
	public String testUser2() {
		return "hello";
    }
	
}
