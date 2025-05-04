package com.cts.service;

import com.cts.exception.UserNotFoundException;
import com.cts.model.UserRoles;

public interface UserRolesService {
	public abstract String addUser(UserRoles user);

	public abstract String updateUser(UserRoles user);

	public abstract String deleteUser(int userId);

	public abstract UserRoles viewUserById(int userId) throws UserNotFoundException;
}
