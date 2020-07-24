package com.lxj.bean;

public class BlankCard {
	
	private Integer cardId;
	
	private String cardName;

	public BlankCard(Integer cardId, String cardName) {
		super();
		this.cardId = cardId;
		this.cardName = cardName;
	}

	public BlankCard() {
		super();
	}

	@Override
	public String toString() {
		return "BlankCard [cardId=" + cardId + ", cardName=" + cardName + "]";
	}

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	
}
