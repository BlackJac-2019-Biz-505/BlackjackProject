package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.blackjack.domain.CardVO;

public class PlayService {

	List<CardVO> cardList;
	List<CardVO> playList;
	String player;
	
	public int sumValue() {
		
		int sum = 0;
		
		cardList = new ArrayList<CardVO>();
		
		for(CardVO vo : cardList) {
			sum += vo.getValue();
			
			
		}
		return sum;
		
		
	}
	
	public void hit() {
		
		if(player.equals("딜러")) {
			
		}
		
		
	}
	
}
