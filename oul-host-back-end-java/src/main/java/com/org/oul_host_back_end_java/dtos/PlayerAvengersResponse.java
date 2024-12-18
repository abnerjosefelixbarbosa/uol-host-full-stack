package com.org.oul_host_back_end_java.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerAvengersResponse {
	@JsonProperty("vingadores")
	private List<PlayerCodenameAvengersResponse> avengers;
}