package com.cts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", initialValue = 1, allocationSize = 1)
	private int userId;
	@NotBlank(message="Name is mandatory")
	@Size(min=2, max=70, message="Name msut be between 2 and 70 characters")
	private String name;
	@NotBlank(message = "Email is mandatory")
	@Email(message = "Provide a valid Email")
	private String email;
	@NotBlank(message = "Password is mandatory")
	@Size(min=6, message="Password should be atleast 6 characters")
	private String password;
	@NotBlank(message = "Role is mandatory")
	@Pattern(regexp="^(Admin|Travel_Agent|Customer)$", message="Role is invalid")
	private String role;
}
