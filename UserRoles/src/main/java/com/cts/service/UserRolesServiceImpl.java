package com.cts.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.exception.UserNotFoundException;
import com.cts.model.UserRoles;
import com.cts.repository.UserRolesRepository;

@Service
public class UserRolesServiceImpl implements UserRolesService {

	@Autowired
	UserRolesRepository repository;
	Logger log = LoggerFactory.getLogger(UserRolesServiceImpl.class);

   

	@Override
	public String addUser(UserRoles user) {
		UserRoles saved = repository.save(user);
		if (saved != null) {
			log.info("New User is saved");
			return "User saved successfully";
		} else
			return "Something went wrong!!!";
	}

	@Override
	public String updateUser(UserRoles user) {
		UserRoles updated=repository.save(user);
		if(updated!=null)
		{
			log.info("Updated user");
			return "User updated successfully";
		}
		else
			return "Something went wrong!!!";
	}

	@Override
	public String deleteUser(int userId) {
		repository.deleteById(userId);
		log.info("A User is deleted");
		return "User deleted successfully!!!";
	}

	@Override
	public UserRoles viewUserById(int userId) throws UserNotFoundException {
		Optional<UserRoles> optional =repository.findById(userId);
		if(optional.isPresent())
			return optional.get();
		else
			throw new UserNotFoundException("User ID is invalid");
	}

}


