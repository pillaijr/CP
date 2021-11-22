
package deliverable1cardgame;

/**
 *
 * @author LENOVO
 */
public class Player {
    // Attributes

     private Hand hand;
     private String name;

     // Default constructor

     public Player(String name) {
          hand = new Hand(); // Instantiate new hand object
          this.name = name;
     }

     // Methods

     public Card playCard() {
          Card c = hand.playCard();
          System.out.println(String.format("%5s", name) + " plays a " + c.getName() + "!");

          return c;
     }

     public void takeCard(Card card) {
          hand.addCard(card);
     }

     public String getName() {
          return name;
     }

     public void displayHand() {
          System.out.println(name + "\'s hand (" + hand.getSize() + "):");
          hand.display();
          System.out.println();
     }

     public int handSize() {
          return hand.getSize();
     }
}
