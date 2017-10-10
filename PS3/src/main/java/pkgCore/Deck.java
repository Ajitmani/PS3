package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public Card Draw() 
	{
		try 
		{
			return cardsInDeck.remove(0);
		}
		catch (Exception DeckException) 
		{
			System.out.println("Deck is empty");
			throw DeckException;
		}
	
	}
	
	public Card Draw(eSuit eSuit) 
	{
		for (Card c:this.cardsInDeck) 
		{
			if (c.geteSuit()==eSuit) 
			{
				cardsInDeck.remove(c);
				return c;
			}
		}
		
		return null;
	}
	

	public Card Draw(eRank eRank) 
	{
		for (Card c:this.cardsInDeck) 
		{
			if (c.geteRank()==eRank) 
			{
				cardsInDeck.remove(c);
				return c;
			}
		}
		
		return null;
	}

	public int SuitNumber(eSuit eSuit)
	{
		int cardNumber=0;
		for(Card c: this.cardsInDeck)
		{
			if (c.geteSuit()==eSuit)
				cardNumber++;
		}
		return cardNumber++;
	}
	
	public int RankNumber(eRank eRank)
	{
		int cardNumber=0;
		for(Card c: this.cardsInDeck)
		{
			if (c.geteRank()==eRank)
				cardNumber++;
		}
		return cardNumber++;
	}
	
	public int FindCard(Card c) 
	{
		for (Card crds:cardsInDeck) {
			if (crds==c)
				return 1;
		}
		return 0;
	}
}
