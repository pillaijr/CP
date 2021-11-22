
package deliverable1cardgame;


public class Card {
    

     private int suit; 
       private int value; 

     

     public Card() { 
          this.suit = 1;
          this.value = 1;
     }

     public Card(int suit, int value) { 
          this.suit = suit;
          this.value = value;
     }

     

     public int getSuit() {
          return this.suit;
     }

     public int getValue() {
          return this.value;
     }

     public void setSuit(int suit) {
          this.suit = suit;
     }

     public void setValue(int value) {
          this.value = value;
     }

     public String getName() {
          String name = "";

          

         if (this.value == 1)
               name = "A";
          else if (value == 11) 
               name = "J";
          else if (value == 12)
               name = "Q";
          else if (value == 13)
               name = "K";
          else 
               name = Integer.toString(value);

          

          if (suit == 1)
               name += (char)'\u2663';
          else if (suit == 2)
               name += (char)'\u2666';
          else if (suit == 3)
               name += (char)'\u2764';
          else if (suit == 4)
               name += (char)'\u2660';

          

          return name;
     }

     public String toString() {
          return getName();
     }
}
    

