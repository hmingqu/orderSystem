package com.hmingqu.orderSystem.cateringModel;

import java.util.Set;

public class RoleEntity {
	
	private String name;
	private String description;
	private Set<UserEntity> userEntities;
	
	public RoleEntity(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<UserEntity> getUserEntities() {
		return userEntities;
	}
	public void setUserEntities(Set<UserEntity> userEntities) {
		this.userEntities = userEntities;
	}
	
}
