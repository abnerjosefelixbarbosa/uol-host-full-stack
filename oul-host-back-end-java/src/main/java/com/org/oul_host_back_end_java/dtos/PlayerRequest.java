package com.org.oul_host_back_end_java.dtos;

import com.org.oul_host_back_end_java.enums.PlayerType;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerRequest {
	@NotEmpty
	@NotNull
	private String name;
	@NotEmpty
	@NotNull
	private String email;
	@NotEmpty
	private String telephone;
	@Enumerated(EnumType.STRING)
	private PlayerType playerType;
}