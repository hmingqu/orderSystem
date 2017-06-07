package com.hmingqu.orderSystem.orderModel;

public class Dishs{
	
	private int dId;
	private String name;
	private double price;
	private String description;
	private String create;
	private String state;
	private DishsType dishsType;
	
	public Dishs(){
		
	}
	
	public Dishs(int dId, String name, double price, String description, String create, String state,
			DishsType dishsType) {
		this.dId = dId;
		this.name = name;
		this.price = price;
		this.description = description;
		this.create = create;
		this.state = state;
		this.dishsType = dishsType;
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

	

	public String getCreate() {
		return create;
	}

	public void setCreate(String create) {
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
	
	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	@Override
	public String toString() {
		return "Dishs [dId=" + dId + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", create=" + create + ", state=" + state + ", dishsType=" + dishsType + "]";
	}
	
	
}
