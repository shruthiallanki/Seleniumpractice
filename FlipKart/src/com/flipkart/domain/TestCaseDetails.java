package com.flipkart.domain;

public class TestCaseDetails
{
	public int testCaseID;
	public String action ;
	public String elementLocator;
	public String inputData;
	
	//Generate getters and Setters
	//
	public int getTestCaseID() {
		return testCaseID;
	}
	public void setTestCaseID(int testCaseID) {
		this.testCaseID = testCaseID;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getElementLocator() {
		return elementLocator;
	}
	public void setElementLocator(String elementLocator) {
		this.elementLocator = elementLocator;
	}
	public String getInputData() {
		return inputData;
	}
	public void setInputData(String inputData) {
		this.inputData = inputData;
	}
	

	

}
