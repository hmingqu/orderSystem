package com.hmingqu.orderSystem.orderModel;

import java.sql.Date;

import com.hmingqu.orderSystem.model.BaseEntity;

public class Dishs extends BaseEntity {
	
	private String name;
	private double price;
	private String description;
	private Date create;
	private String state;
	private DishsType dishsType;
	
	public Dishs(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public DishsType getDishsType() {
		return dishsType;
	}

	public void setDishsType(DishsType dishsType) {
		this.dishsType = dishsType;
	}
	
	
	
}
