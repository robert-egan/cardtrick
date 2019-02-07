class MyMain{
	
	public static void main(String args[]) {
		CardTrick myTrick = new CardTrick();
		myTrick.makeDeck();
		myTrick.makePiles();
		myTrick.printPiles();
		myTrick.getChoice();
		myTrick.rebuildDeck();
		myTrick.makePiles();
		myTrick.printPiles();
		myTrick.getChoice();
		myTrick.rebuildDeck();
		myTrick.makePiles();
		myTrick.printPiles();
		myTrick.getChoice();
		myTrick.rebuildDeck();
		myTrick.guessNumber();
	}
}