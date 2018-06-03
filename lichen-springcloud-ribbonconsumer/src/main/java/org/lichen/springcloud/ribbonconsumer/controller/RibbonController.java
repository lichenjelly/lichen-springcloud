package org.lichen.springcloud.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="ribbon")
public class RibbonController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/{name}")
	public String getRibbon(@PathVariable("name") String name){
		return restTemplate.getForObject("http://client/my/"+name,String.class);
	}
}
