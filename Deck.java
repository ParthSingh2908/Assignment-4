import java.util.*;


public class Deck {
    ArrayList<Card> card= new ArrayList<Card>();
    String[] suit = {"Spade", "Club", "Diamond", "Heart"};
    String[] value = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q"};

    public void createDeck(){
        for (String s : suit) {
            for (String item : value) {
                this.card.add(new Card(s, item));
            }
        }
    }

    public void printDeck(){
        System.out.println(this.card);
    }

    public void printCard(){
        System.out.println(this.card.get(0));
    }

    public void sameCard(){
        int index = (int)(Math.random()*this.card.size());
        Card selectedCard = this.card.get(index);
        System.out.println("This randomly selected card belongs to "+selectedCard.getSuit()+".");
    }

    public void compareCard(){
        int index1 = (int)(Math.random()*this.card.size());
        int index2 = (int)(Math.random()*this.card.size());
        Card selectedCard1 = this.card.get(index1);
        Card selectedCard2 = this.card.get(index2);
        if(selectedCard1.getValue() == selectedCard2.getValue()){
            System.out.println("Two randomly generated cards have same rank or value");
        }else{
            System.out.println("Two randomly generated cards have different rank or value");
        }
    }

    public void findCard(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter suit: ");
        String suit = scan.nextLine();
        System.out.print("Enter value: ");
        String value = scan.nextLine();

        for(int i=0; i<card.size(); i++){
            Card c = this.card.get(i);
            if(c.getSuit().equals(suit)){
                if(c.getValue().equals(value)){
                    System.out.println(this.card.get(i));
                }
            }
        }
    }

    public void dealCards(){
        for(int i=0;i<5;i++){
            int index = (int)(Math.random()*this.card.size());
            System.out.print(card.get(index));
        }
    }

    public void shuffle(){
        Collections.shuffle(this.card);
        printDeck();
    }

    Deck(){
        this.createDeck();
    }
}
