package jp.co.tibilabo.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@Autowired
	private UserDao userDao;
	
	@GetMapping
	public String sayHelloWorld(Model model) {
		model.addAttribute("name", userDao.selectById(1).getName());
		return "hello/hello_world";
	}
}
