package day1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colorController {
	@RequestMapping(value="/MyFav/{color}",method=RequestMethod.GET)
	public String getMyFav(@PathVariable String color)
	{
		return "My favorite color is "+color;
	}
}
