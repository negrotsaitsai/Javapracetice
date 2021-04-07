/**
 * @(#)UseEnum.java
 *
 *
 * @author 
 * @version 1.00 2008/4/12
 */

enum Suit {
 SPADES,
 HEARTS,
 CLUBS,
 DIAMONDS
 }
 
 class PlayingCard {

 private Suit suit;
 private int rank;

 public PlayingCard(Suit suit, int rank) {
   this.suit = suit;
   this.rank = rank;
 }

 public Suit getSuit() {
    return suit;
 }
 public String getSuitName() {
 String name = "";
 switch ( suit ) {
   case SPADES:
     name = "Spades";
     break;
   case HEARTS:
     name = "Hearts";
     break;
   case CLUBS:
     name = "Clubs";
     break;
   case DIAMONDS:
     name = "Diamonds";
     break;
   default:
 // No need for error checking as the Suit
 // enum is finite.
 }
 return name;
 } 
 int getRank(){
 	return rank;
 }	
} 	
 
public class UseEnum {
 public static void main(String[] args) {

 PlayingCard card1= new PlayingCard(Suit.SPADES, 2);
 System.out.println("card1 is the " + card1.getRank()+ " of " + card1.getSuitName());

 // PlayingCard card2 = new PlayingCard(47, 2);
 // This will not compile.
 }
}