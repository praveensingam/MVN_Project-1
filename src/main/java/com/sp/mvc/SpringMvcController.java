package com.sp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMvcController {
	@RequestMapping(value="/getData")
  public String getData() {
	  return "hello ashok it";
  }
}
