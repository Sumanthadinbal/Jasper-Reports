package com.example.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping(value = "/report", method = RequestMethod.GET)
	public byte[] getUserReport(@RequestParam("type") String type, @RequestParam("user") String user,
			@RequestParam("lang") String lang, HttpServletResponse response) {
		return service.getUserReport(type, user, lang, response);

	}

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public Object sayHi() {

		return "Hi";
	}

	@RequestMapping(value = "/stock", method = RequestMethod.GET)
	public byte[] getStocks(HttpServletResponse response) {

		return null;
	}
}
