package com.hmingqu.orderSystem.orderModel;

import java.util.Set;

public class TableType{
	
	private int id;
	private String name;
	private Set<Tables> tables;
	
	public TableType(){
		
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

	public Set<Tables> getTables() {
		return tables;
	}

	public void setTables(Set<Tables> tables) {
		this.tables = tables;
	}
	
	
}
