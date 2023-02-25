package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Policy {
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	private String ID;

}
