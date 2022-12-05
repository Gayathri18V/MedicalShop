package com.example.demo.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Tablet")

public class Tablet {
	@Id
	
	   private String tabletId;
	   private String tabletname;
	   private String username;
	   private String tabletquantity;
	public String getTabletId() {
		return tabletId;
	}
	public void setTabletId(String tabletId) {
		this.tabletId = tabletId;
	}
	public String getTabletname() {
		return tabletname;
	}
	public void setTabletname(String tabletname) {
		this.tabletname = tabletname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTabletquantity() {
		return tabletquantity;
	}
	public void setTabletquantity(String tabletquantity) {
		this.tabletquantity = tabletquantity;
	}

	
	   

}
