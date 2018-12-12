package com.neusoft.entity;

import java.util.Date;

public class SCardInfo {
	private Integer sid;
	private String sname;
	private String idCard;
	private String scard;
	private Date sdate;
	private CardType cardType;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getScard() {
		return scard;
	}
	public void setScard(String scard) {
		this.scard = scard;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public CardType getCardType() {
		return cardType;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	
	
}
