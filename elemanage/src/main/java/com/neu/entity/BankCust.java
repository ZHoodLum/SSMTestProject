package com.neu.entity;

import java.math.BigDecimal;

public class BankCust {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column bank_cust.card_id
	 * @mbg.generated  Thu Nov 15 09:14:51 CST 2018
	 */
	private String cardId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column bank_cust.blanace
	 * @mbg.generated  Thu Nov 15 09:14:51 CST 2018
	 */
	private BigDecimal blanace;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column bank_cust.card_id
	 * @return  the value of bank_cust.card_id
	 * @mbg.generated  Thu Nov 15 09:14:51 CST 2018
	 */
	public String getCardId() {
		return cardId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column bank_cust.card_id
	 * @param cardId  the value for bank_cust.card_id
	 * @mbg.generated  Thu Nov 15 09:14:51 CST 2018
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column bank_cust.blanace
	 * @return  the value of bank_cust.blanace
	 * @mbg.generated  Thu Nov 15 09:14:51 CST 2018
	 */
	public BigDecimal getBlanace() {
		return blanace;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column bank_cust.blanace
	 * @param blanace  the value for bank_cust.blanace
	 * @mbg.generated  Thu Nov 15 09:14:51 CST 2018
	 */
	public void setBlanace(BigDecimal blanace) {
		this.blanace = blanace;
	}
}