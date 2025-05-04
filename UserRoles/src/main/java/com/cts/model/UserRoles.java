package com.cts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name="roles")
public class UserRoles {
	@Id
	private int userId;
	private String name;
	private String email;
	private String password;
	private String role;
}
