package com.hmingqu.orderSystem.orderModel;
import com.hmingqu.orderSystem.model.BaseEntity;

public class Tables extends BaseEntity {
	
	private String name;
	private String type;
	private String state;
	private String capacity;
	private TableType tableType;
	
	public Tables(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public TableType getTableType() {
		return tableType;
	}

	public void setTableType(TableType tableType) {
		this.tableType = tableType;
	}
	
	
}
