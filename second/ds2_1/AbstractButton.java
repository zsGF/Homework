package com.flyingdigital.ds2_1;


public abstract class AbstractButton {
	private String btName;
	
	public AbstractButton(String btName) {
		this.btName = btName;
	}
	public abstract void display();
	public String getName() {
		return this.btName;
	}
}
