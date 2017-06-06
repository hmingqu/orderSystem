package com.hmingqu.orderSystem.orderModel;

import com.hmingqu.orderSystem.model.BaseEntity;

public class TableType extends BaseEntity {
	
	private String name;
	
	public TableType(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
