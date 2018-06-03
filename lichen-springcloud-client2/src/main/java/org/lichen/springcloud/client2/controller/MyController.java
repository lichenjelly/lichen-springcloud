package org.lichen.springcloud.client2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(value = "my")
@RestController
public class MyController {
	@Value("${server.port}")
	private String port;
	
	@RequestMapping(method = RequestMethod.GET,value = "/{name}")
	public String hiController(@PathVariable(value = "name") String name){
		return name + port;
	}
}
