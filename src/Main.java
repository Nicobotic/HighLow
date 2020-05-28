import javax.swing.*;

public class Main {
	
	//instance variables
    private static int loss;
    private static int wins;
    private static Card card;
    private static Card card2;
    private static int cardCount;
    static String[] Rank = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    static int[] pointValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    static String[] Suit = {"Clover", "Rhombus", "Shovel", "Ticker"};
    static String[] option1 = {"High", "Low", "Exit"};

    //main method
    public static void main(String[] args) {
        loss = 0;
        wins = 0;
        cardCount = 0;
        JOptionPane.showMessageDialog(null, "Introduction to the high low game\n" +
                "You will guess if the shown card\n" +
                "is higher or lower than the next card. Have fun");

        Deck deck = new Deck(Rank, Suit, pointValue);
        while (cardCount < 26 && loss < 3) {
            card = deck.deal();
            card2 = deck.deal();
            int x = Window.option(option1, card +"\n" + "Is this card higher or lower than the next one?\nCorrect guesses: " +wins + "\n");

            if (x == 0) {
                if(card.pointValue() == card2.pointValue()){
                    JOptionPane.showMessageDialog(null, "It's a tie. No points are given");
                }
                else if (card.pointValue() > card2.pointValue()) {
                    JOptionPane.showMessageDialog(null, "The second card was " + card2 + "\n You guessed correct");
                    wins++;
                } else {
                    JOptionPane.showMessageDialog(null, "The second card was " + card2 +"\n You guessed wrong");
                    loss++;
                }
            }
            if (x == 1) {
                if(card.pointValue() == card2.pointValue()){
                    JOptionPane.showMessageDialog(null, "It's a tie. No points are given");
                }
                if (card.pointValue() < card2.pointValue()) {
                    JOptionPane.showMessageDialog(null, "The second card was " + card2 + "\n You guessed correct");
                    wins++;
                } else {
                    JOptionPane.showMessageDialog(null, "The second card was " + card2 +"\n You guessed wrong");
                    loss++;
                }
            }

            if (x == 2) {
                System.exit(0);
            }

        }
        if(loss == 3){
            JOptionPane.showMessageDialog(null, "Game Over!\nNumber of correct guesses: " + wins);
        }
        if(cardCount == 26){
            JOptionPane.showMessageDialog(null, "You got through the entire deck and got " + loss +" wrong. \nGood job");
        }
    }
}


