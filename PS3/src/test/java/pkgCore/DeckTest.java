package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestEmptyDeck() {
		
	}
	
	@Test
	public void TestDrawSuit() {
		Deck x = new Deck();
		Card card = x.Draw(pkgEnum.eSuit.HEARTS);
		assertTrue(card.geteSuit()==pkgEnum.eSuit.HEARTS);
	}
	
	@Test
	public void TestDrawRank() {
		Deck x = new Deck();
		Card card = x.Draw(pkgEnum.eRank.TWO);
		assertTrue(card.geteRank()==pkgEnum.eRank.TWO);
	}
	
	public void TestDeckRankCount() {
		Deck x = new Deck();
		assertEquals(x.RankNumber(pkgEnum.eRank.TWO), 4);
	}
	
	public void TestDeckSuitCount() {
		Deck x = new Deck();
		assertEquals(x.SuitNumber(pkgEnum.eSuit.HEARTS), 13);
	}

}
