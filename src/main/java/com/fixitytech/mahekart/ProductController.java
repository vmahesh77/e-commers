package com.fixitytech.mahekart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	@RequestMapping( value="/product", method=RequestMethod.GET)
    public String product() {
        
        
		return "product";//jsp
    }
	
}
