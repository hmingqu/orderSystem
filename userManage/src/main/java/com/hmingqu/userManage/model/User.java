package com.hmingqu.userManage.model;

import java.io.File;

public class User {
	private int id;
	private String name;
	private String password;
	private String headerUri;
	private File myfile;
	private String myfileFileName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getHeaderUri() {
		return headerUri;
	}
	public void setHeaderUri(String headerUri) {
		this.headerUri = headerUri;
	}
	//�ļ��ϴ�
	public File getMyfile() {
		return myfile;
	}
	public void setMyfile(File myfile) {
		this.myfile = myfile;
	}
	public String getMyfileFileName() {
		return myfileFileName;
	}
	public void setMyfileFileName(String myfileFileName) {
		this.myfileFileName = myfileFileName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + ">>>>>>" + this.name+">>>>>>>"+this.password;
	}
	
}
