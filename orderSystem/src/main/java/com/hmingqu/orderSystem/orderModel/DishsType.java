package com.hmingqu.orderSystem.orderModel;

import java.util.Set;

public class DishsType{
	
	private int id;
	private String name;
	private Set<Dishs> dishs;
	
	public DishsType(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Dishs> getDishs() {
		return dishs;
	}

	public void setDishs(Set<Dishs> dishs) {
		this.dishs = dishs;
	}
	
}
