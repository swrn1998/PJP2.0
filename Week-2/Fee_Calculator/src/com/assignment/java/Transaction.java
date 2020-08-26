package com.assignment.java;

public class Transaction {

	private String transactionId;
	private String clientId;
	private String securityId;
	private TransactionType tType;
	private String date;
	private Double marketValue;
	private String priorityFlag;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public TransactionType gettType() {
		return tType;
	}

	public void settType(TransactionType tType) {
		this.tType = tType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}

	public String getPriorityFlag() {
		return priorityFlag;
	}

	public void setPriorityFlag(String priorityFlag) {
		this.priorityFlag = priorityFlag;
	}

	public Transaction(String transactionId, String clientId, String securityId, TransactionType tType, String date,
			Double marketValue, String priorityFlag) {
		this.transactionId = transactionId;
		this.clientId = clientId;
		this.securityId = securityId;
		this.tType = tType;
		this.date = date;
		this.marketValue = marketValue;
		this.priorityFlag = priorityFlag;
		
	}

	//For Summary Report
	public Transaction(String clientId, TransactionType tType, String date, String priorityFlag) {
		this.clientId = clientId;
		this.tType = tType;
		this.date = date;
		this.priorityFlag = priorityFlag;		
	}

}
