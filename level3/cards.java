import java.util.Arrays;
import java.util.Scanner;

public class cards {
    public static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static String[] initializeDeck() {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }
        
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;
        
        for (int player = 0; player < numPlayers; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                players[player][card] = deck[cardIndex++];
            }
        }
        return players;
    }
    public static void printPlayersCards(String[][] players) {
        if (players == null) return;
        
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);
     
        printPlayersCards(players);
        
        scanner.close();
    }
}