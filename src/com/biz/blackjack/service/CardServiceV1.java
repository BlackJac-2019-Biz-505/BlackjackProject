package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.blackjack.domain.CardVO;

public class CardServiceV1 {

	List<CardVO> cardList;
	String pattern = "◆:♥:♠:♣";
	String cardNum = "A:2:3:4:5:6:7:8:9:10:K:Q:J";
	
	public CardServiceV1() {
		// TODO 생성자
		cardList = new ArrayList<CardVO>();
	}
	
	public void makeDeck() {
		
		String[] getPattern = pattern.split(pattern); 
		String[] getCardNum = cardNum.split(cardNum);
		
		for(String p : getPattern) {
			for(String n : getCardNum) {
				
				CardVO vo = new CardVO();
				vo.setPattern(p);
				vo.setCardNum(n);
				
				
				int intValue = 0;
				while(true) {
					n.equals("A");
						intValue = 1;
				}
				
				
				
				
			}
		}
		
	}
	public void viewCardDeck() {
		
		for(CardVO vo : cardList) {
			System.out.println(vo);
		}
		System.out.println("=======================");
		System.out.println("카드매수 : " + cardList.size());
	}
	
}
