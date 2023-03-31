//Name: Parth Singh
//PRN: 21070126062
//Branch: AIML A3

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("1. createDeck");
        System.out.println("2. printDeck");
        System.out.println("3. printCard");
        System.out.println("4. sameCard");
        System.out.println("5. compareCard");
        System.out.println("6. findCard");
        System.out.println("7. dealCard");
        System.out.println("8. shuffleCard");

        Scanner scan = new Scanner(System.in);
        int choice = Integer.parseInt(scan.next());

        switch(choice){
            case 1:
                System.out.println("Done");
                break;
            case 2:
                deck.printDeck();
                break;
            case 3:
                deck.printCard();
                break;
            case 4:
                deck.sameCard();
                break;
            case 5:
                deck.compareCard();
                break;
            case 6:
                deck.findCard();
                break;
            case 7:
                deck.dealCards();
                break;
            case 8:
                deck.shuffle();
                break;
        }

    }
}
