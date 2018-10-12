package com.wilson.ln.expensemanager.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Expense implements Serializable {

	private static final long serialVersionUID = 1L;
	private String merchant;
	private BigDecimal transactionAmount;
	private String transactionDate;
	private String purchaseType;

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}

}
