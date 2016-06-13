package cn.itcast.springboot.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;

@Api(value="demo-api")
@Controller
@RequestMapping("/api/")
public class APIController {

	@RequestMapping(value="demo/get.do/{id}",method=RequestMethod.GET)
	@ResponseBody
	public String getPathVariable(@PathVariable Long id) {
		return null ;
	}
}
