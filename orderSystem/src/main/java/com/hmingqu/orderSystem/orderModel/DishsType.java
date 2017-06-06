package com.hmingqu.orderSystem.orderModel;
import com.hmingqu.orderSystem.model.BaseEntity;

public class DishsType extends BaseEntity {
	
	private String name;
	
	public DishsType(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
