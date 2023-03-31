This is the directory for Assignment 4: Card
It contains three files:

1. Main.java
2. Card.java
3. Deck.java

Operations.java contains Operations class with following three methods:

1. createDeck(): This is the method used to Method to create whole deck combining all the suit with vall the alues.
2. printDeck(): This is the method used to to print whole deck.
3. printCard(): This is the method used to to print first card of the deck.
4. sameCard(): This is the method used to randomly select a card and find its suit.
5. compareCard(): This is the method used to compare values of two randomly selected cards and returns the result as a string telling if they have same or different.
6. findCard(): This is the method used to to find card using suit and value.
7. dealCards(): This is the method used to print 5 random cards from the deck.
8. shuffle(): This is the method to shuffle the card deck and printing them.

Card.java contains InputUser class with following methods:

1. It contains getter and setter methods for all the private variables suit and value stored in a single Card object.
2. It also contains parameterized constructor with all the variables suit and value.

Main.java contains Main class with following methods:

1. It contains switch case where user is allowed to enter a character for particular operations.
2. It contains main method inside which there's switch case for menu to select operations corresponding to methods in Deck java class.
3. Main method catches the returned values from different methods of Operations class and display them.
