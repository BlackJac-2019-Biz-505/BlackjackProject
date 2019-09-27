package com.biz.blackjack.exec;

import com.biz.blackjack.service.CardService;

public class CardServiceEx_01 {

	public static void main(String[] args) {

		CardService cs = new CardService();
		
		cs.makeDeck();
		cs.viewCardList();
		
		
	}

}
