import java.util.Scanner;

class CardTrick{
	
	int[] deck = new int[21];
	int[] pile1 = new int[7];
	int[] pile2 = new int[7];
	int[] pile3 = new int[7];
	int choice;
	
	public void makeDeck() {
		//populates the deck and prints the numbers to the screen as it goes
		for(int i = 0;i<21;i++) {
			deck[i]=i;
			System.out.print(deck[i]+" ");
		}
		System.out.println();
		System.out.println("Please think of a number from the deck.");
	}
	public void makePiles() {
		//Creates the three piles, placing every third card in the same pile
		int c = 0;
		for(int i = 0; i<7;i++) {
			pile1[i]=deck[c];
			c++;
			pile2[i]=deck[c];
			c++;
			pile3[i]=deck[c];
			c++;
		}
	}
	public void printPiles(){
		//Prints out each pile to the screen
		System.out.println("pile1");
		for(int i =0;i<7;i++) {
			System.out.print(pile1[i]+" ");
		}
		System.out.println();
		System.out.println("pile2");
		for(int i =0;i<7;i++) {
			System.out.print(pile2[i]+" ");
		}
		System.out.println();
		System.out.println("pile3");
		for(int i =0;i<7;i++) {
			System.out.print(pile3[i]+" ");
		}
		System.out.println();
	}
	public void getChoice() {
		do {
			/*
			 * Prompts the user to select the pile that their number is in
			 * Stores the answer in the variable choice
			 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Which pile is your number in?");
			choice = scan.nextInt();
		}while(choice<1 && choice>3);
		//Disregards answers which are not 1, 2, or 3
	}
	
	public void rebuildDeck() {
		/*
		 * Rebuilds the deck such that the pile selected by the user is sandwiched
		 * between the other two piles. Uses the switch case based on the variable
		 * choice.
		 */
		int c = 0;
		switch(choice) {
			case 1: 
				for(int i =0;i<7;i++) {
				deck[c]=pile2[i];
				c++;
				}
				for(int i =0;i<7;i++) {
					deck[c]=pile1[i];
					c++;
				}
				for(int i =0;i<7;i++) {
					deck[c]=pile3[i];
					c++;
				}
				break;
			case 2:
				for(int i =0;i<7;i++) {
					deck[c]=pile1[i];
					c++;
				}
				for(int i =0;i<7;i++) {
					deck[c]=pile2[i];
					c++;
				}
				for(int i =0;i<7;i++) {
					deck[c]=pile3[i];
					c++;
				}
				break;
			case 3:
				for(int i =0;i<7;i++) {
					deck[c]=pile1[i];
					c++;
				}
				for(int i =0;i<7;i++) {
					deck[c]=pile3[i];
					c++;
				}
				for(int i =0;i<7;i++) {
					deck[c]=pile2[i];
					c++;
				}
				break;
		}
	}
	public void guessNumber() {
		//Prints out the 11th card in the deck
		System.out.println("Your number is: " + deck[10]);
	}
}
