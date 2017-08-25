package com.Serialization;

import java.io.Serializable;

public class ImplementsSerializable implements Serializable{

	private static final long serialVersionUID = -5988076369893094302L;
	
	public byte byteVal = 12;
	public char appenders = '\n';
	public transient String className = "ImplementsSerializable";
	
	public byte getByteVal() {
		return byteVal;
	}
	public void setByteVal(byte byteVal) {
		this.byteVal = byteVal;
	}
	public char getAppenders() {
		return appenders;
	}
	public void setAppenders(char appenders) {
		this.appenders = appenders;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
