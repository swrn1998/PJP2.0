package com.assignment.java;

public class SummaryReport extends Transaction {

	private Double processingFee;

	public SummaryReport(String clientId, TransactionType tType, String date, String priorityFlag,
			Double processingFee) {
		super(clientId, tType, date, priorityFlag);
		this.processingFee = processingFee;
	}

	public Double getProcessingFee() {
		return processingFee;
	}

	public void setProcessingFee(Double processingFee) {
		this.processingFee = processingFee;
	}

}
