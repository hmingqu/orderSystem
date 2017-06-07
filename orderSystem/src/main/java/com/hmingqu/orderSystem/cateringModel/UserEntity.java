package com.hmingqu.orderSystem.cateringModel;

public class UserEntity {
	
	private String name;
	private String password;
	private int state;
	private RoleEntity roleEntity;
	
	public UserEntity(){
		
	}
	
	public UserEntity(String name,String password,int state){
		this.name = name;
		this.password = password;
		this.state = state;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	public RoleEntity getRoleEntity() {
		return roleEntity;
	}

	public void setRoleEntity(RoleEntity roleEntity) {
		this.roleEntity = roleEntity;
	}
	
}
