package com.biz.blackjack.exec;

import com.biz.blackjack.service.CardServiceV1;

public class CardServiceEx_02 {

	public static void main(String[] args) {

		CardServiceV1 csV1 = new CardServiceV1();
		
		csV1.makeDeck();
		csV1.viewCardDeck();
		
		
	}

}
