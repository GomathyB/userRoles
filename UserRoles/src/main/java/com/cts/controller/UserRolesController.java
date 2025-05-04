package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.exception.UserNotFoundException;
import com.cts.model.UserRoles;
import com.cts.service.UserRolesService;

@RestController
@RequestMapping("/userRoles")
public class UserRolesController {
	@Autowired
	UserRolesService service;

	@PostMapping("/addUser")
	public String addUser(@RequestBody UserRoles user) {
		return service.addUser(user);
	}

	@PutMapping("/updateUser")
	public String updateUser(@RequestBody UserRoles user) {
		return service.updateUser(user);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int userId) {
		return service.deleteUser(userId);
	}

	@GetMapping("/viewUserById/{id}")
	public UserRoles viewUserById(@PathVariable("id") int userId) throws UserNotFoundException {
		return service.viewUserById(userId);
	}
}
