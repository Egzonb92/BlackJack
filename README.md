# BlackJack
A black jack game with Marit and Egzon, made in java.

A card stack is created from a given source. Two players 'Egzon' and 'Marit' plays black jack, 
by fetching two cards each. First Egzon checks his cards. If he has card values of 21, he is the winner.
If his value is under 17 he has to fetch a new card, and if he gets over 21 he loses the game. 

After Egzon has fetched his cards, and has a sum betweene 17 and 21, Marit will look at her cards.
If she has a value lower than Egzon, then she will fetch a new card. 
If she gets a higher value than Egzon, that is lower or equal to 21, she wins. 
Else, she loses. 

## Rules
* The first to 21 wins
* If no one has 21 the players have to pick cards from the top of the stack
* Both have to pick two cards each in the beginning
* Egzon has to pick a new card if his sum is under 17
* Egzon loses if he gets a sum of 22 or more 
* When Egzon is done Marit has to pick cards while she has a lower or equal sum to Egzon's sum.
* Marit loses the game if she reaches a sum of more than 21. 

## How to run
The program runs by compiling all the following files found in the 'src' folder:
*   BlackJack.java
*   Card.java
*   CardStack.java
*   Player.java

And then by running the BlackJack.class file. 

The result is writen to System.out, by anouncing the winner, and then representing the cards of the players, together with their sums. 

## Example output
``` 

Vinner: Marit

Egzon | 25 | S4,D4,S7,HQ
Marit | 11 | C5,H6

```
