import java.util.Random;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int selection = 0;
        int repeat = 1;

        do {

        do {
        System.out.println("Welcome to the Card Program!");
        System.out.println("In this program, you can either Test the Pack" +
        " or you can Play 'Go Fish'.");
        System.out.println("Type 1 to Test the Pack, 2 to play Go Fish, or 3 to Quit the Program.");
        selection = scan.nextInt();
        } while(selection != 1 && selection != 2 && selection != 3);

        if(selection == 1){ //TEST THE PACK

        int cont = 0;

        PackofCards pack1 = new PackofCards();
        PackofCards pack2 = new PackofCards();

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                Card newCard = new Card(i, j);
                pack1.insert(newCard);
            }
        }

        do {
        System.out.println("Welcome to the Test the Pack Program!\n");
        System.out.println("This program will allow you to manipulate two " + 
        "decks of cards.\n");
        System.out.println("One of these decks is a full standard poker deck, " 
        + "and one is an empty hand.\n");
        System.out.println("Which deck would you like to manipulate?\n");

        System.out.println("Select 1 for the poker deck and 2 for the empty deck.\n");
        int deck = scan.nextInt();

        while(deck != 1 && deck != 2){
            System.out.println("Incorrect input. Try again.\n");
            System.out.println("Select 1 for the poker deck and 2 for the empty deck.\n");
            deck = scan.nextInt();
        }

        if(deck == 1) { //POKER DECK
            int operation;
            do{
            System.out.println("-------POKER DECK MENU- ------\n");
            System.out.println("1: Insert a card\n");
            System.out.println("2: Delete a card\n");
            System.out.println("3: Delete a random card\n");
            System.out.println("4: Get the number of times a value of card occurs " + 
            "in the deck. (Ace - King)\n");
            System.out.println("5: Get the size of the deck.\n");
            System.out.println("6: Display all cards in the pack.\n");
            System.out.println(" ---- Please select an option from above. ----\n");
            operation = scan.nextInt();
            } while(operation < 1 || operation > 6);

            switch(operation) {
                case 1: //INSERT A CARD
                int suit;
                int value;
                Card newCard;
                do {
                    System.out.println("Please tell me the suit of your card.\n");
                    System.out.println("Type 1 for Hearts, 2 For Spades, 3 for Diamonds, and 4 for Clubs.\n");
                    suit = scan.nextInt();
                } while(suit < 1 || suit > 4);
                do {
                    System.out.println("Now please tell me the value of your card using integer values only.\n");
                    System.out.println("Ace = 1, Jack = 11, etc.\n");
                    value = scan.nextInt();
                } while(value < 1 || value > 13);
                newCard = new Card(suit, value);
                pack1.insert(newCard);
                System.out.println("Your card has been inserted into the deck.\n");
                break;

                case 2: //DELETE A CARD
                do {
                    System.out.println("Please tell me the suit of the card.\n");
                    System.out.println("Type 1 for Hearts, 2 For Spades, 3 for Diamonds, and 4 for Clubs.\n");
                    suit = scan.nextInt();
                } while(suit < 1 || suit > 4);
                do {
                    System.out.println("Now please tell me the value of the card using integer values only.\n");
                    System.out.println("Ace = 1, Jack = 11, etc.\n");
                    value = scan.nextInt();
                } while(value < 1 || value > 13);
                newCard = new Card(suit, value);
                
                if(pack1.delete(newCard) == null) {
                    System.out.println("The card was not in the deck.\n");
                }
                else {
                    System.out.println("The card was deleted.\n");
                }
                break;

                case 3: //DELETE A RANDOM CARD
                    System.out.println(pack1.deleteAny() + " was deleted from the deck.\n");
                    break;

                case 4: //COUNT FUNCTION
                do {
                    System.out.println("Please tell me the value of card you are looking for using integer values only.\n");
                    System.out.println("Ace = 1, Jack = 11, etc.\n");
                    value = scan.nextInt();
                } while(value < 1 || value > 13);
                System.out.println("This value occurs in the deck " + pack1.count(value) + " times.\n");
                break;

                case 5: //GET SIZE
                    System.out.println("The size of the deck is: " + pack1.getSize() + "\n");
                    break;
                
                case 6: //TO STRING
                    System.out.println(pack1.toString());
                    break;
            }
        }

        if (deck == 2) { //EMPTY PACK
            int operation;
            do{
            System.out.println("-------EMPTY DECK MENU- ------\n");
            System.out.println("1: Insert a card\n");
            System.out.println("2: Delete a card\n");
            System.out.println("3: Delete a random card\n");
            System.out.println("4: Get the number of times a value of card occurs " + 
            "in the deck. (Ace - King)\n");
            System.out.println("5: Get the size of the deck.\n");
            System.out.println("6: Display all cards in the pack.\n");
            System.out.println(" ---- Please select an option from above. ----\n");
            operation = scan.nextInt();
            } while(operation < 1 || operation > 6);

            switch(operation) {
                case 1: //INSERT A CARD
                int suit;
                int value;
                Card newCard;
                do {
                    System.out.println("Please tell me the suit of your card.\n");
                    System.out.println("Type 1 for Hearts, 2 For Spades, 3 for Diamonds, and 4 for Clubs.\n");
                    suit = scan.nextInt();
                } while(suit < 1 || suit > 4);
                do {
                    System.out.println("Now please tell me the value of your card using integer values only.\n");
                    System.out.println("Ace = 1, Jack = 11, etc.\n");
                    value = scan.nextInt();
                } while(value < 1 || value > 13);
                newCard = new Card(suit, value);
                pack2.insert(newCard);
                System.out.println("Your card has been inserted into the deck.\n");
                break;

                case 2: //DELETE A CARD
                do {
                    System.out.println("Please tell me the suit of the card.\n");
                    System.out.println("Type 1 for Hearts, 2 For Spades, 3 for Diamonds, and 4 for Clubs.\n");
                    suit = scan.nextInt();
                } while(suit < 1 || suit > 4);
                do {
                    System.out.println("Now please tell me the value of the card using integer values only.\n");
                    System.out.println("Ace = 1, Jack = 11, etc.\n");
                    value = scan.nextInt();
                } while(value < 1 || value > 13);
                newCard = new Card(suit, value);
                
                if(pack2.delete(newCard) == null) {
                    System.out.println("The card was not in the deck.\n");
                }
                else {
                    System.out.println("The card was deleted.\n");
                }
                break;

                case 3: //DELETE A RANDOM CARD
                System.out.println(pack2.deleteAny() + " was deleted from the deck.\n");
                    break;

                case 4: //COUNT FUNCTION
                do {
                    System.out.println("Please tell me the value of card you are looking for using integer values only.\n");
                    System.out.println("Ace = 1, Jack = 11, etc.\n");
                    value = scan.nextInt();
                } while(value < 1 || value > 13);
                System.out.println("This value occurs in the deck " + pack2.count(value) + " times.\n");
                break;

                case 5: // GET SIZE
                    System.out.println("The size of the deck is: " + pack2.getSize() + "\n");
                    break;
                
                case 6: //TO STRING
                    System.out.println(pack2.toString());
                    break;
            }
        }


        System.out.println("Would you like to run the program again?"
        + " 1 for yes and 0 for no.\n");
        cont = scan.nextInt();

        while(cont != 1 && cont != 0){
            System.out.println("Incorrect input. Try again.\n");
            System.out.println("Would you like to run the program again?"
            + " 1 for yes and 0 for no.\n");
            cont = scan.nextInt();
        }

        } while(cont == 1);

        System.out.println("Thanks for using the Test the Pack program! Decks have been reset. Goodbye!");
     }
     else if(selection == 2) { // GO FISH

        int userBooks = 0;
        int computerBooks = 0;

        PackofCards stock = new PackofCards();
        PackofCards userPack = new PackofCards();
        PackofCards computerPack = new PackofCards();

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 14; j++) {
                Card newCard = new Card(i, j);
                stock.insert(newCard);
            }
        }

        for (int i = 0; i < 7; i++) {
            userPack.insert(stock.deleteAny());
            computerPack.insert(stock.deleteAny());
        }

        System.out.println("-----YOUR HAND-----\n" + userPack.toString() + "\n");

        while(userBooks + computerBooks != 26 && userPack.getSize() != 0 && computerPack.getSize() != 0) {

            int userRequestedCard = 0;
            int computerRequestedCard = 0;
            int guessedCorrectly;
            int viewHand = 0;

            do {
            
                if(userPack.getSize() == 0) {
                    break;
                }
                
                System.out.println("Would you like to view your hand? 1 for yes and 0 for no.\n");
                viewHand = scan.nextInt();

                while(viewHand != 0 && viewHand != 1) {

                    System.out.println("Invalid response. Please enter 1 for yes and 0 for no.\n");
                    viewHand = scan.nextInt();
                }

                if(viewHand == 1) {

                     System.out.println(userPack.toString() + "\n");

                }

                do {

                System.out.println("Please ask the computer for a card. (Ace - King)\n");
                System.out.println("Warning! You must have at least one of the card value you are asking for!\n");
                System.out.println("Hey computer, do you have a: ");

                userRequestedCard = scan.nextInt();


                if(userRequestedCard < 1 || userRequestedCard > 13) {
                    System.out.println("That value doesn't exist in the deck! Pick an existing value!\n");
                    userRequestedCard = 0;
                }

                if(userPack.count(userRequestedCard) == 0) {
                    System.out.println("You don't have one of those cards! Try again.\n");
                }
            } while(userPack.count(userRequestedCard) == 0);

            if(computerPack.count(userRequestedCard) == 0) {
                System.out.println("Computer says: GO FISH!\n");
                if(stock.getSize() == 0) {
                    System.out.println("No card was drawn because the deck is empty.\n");
                }
                else {
                userPack.insert(stock.deleteAny());
                System.out.println("You drew a card.\n");
                }
                guessedCorrectly = 0;

                for (int i = 1; i < 13; i++) {
                    if(userPack.count(i) == 4) {
                        userBooks++;
                        System.out.println("You have a book of " + i + "'s! Congrats!\n");
                        System.out.println("All of the " + i + "'s have been removed from you hand.\n");
                        for (int j = 1; j <= 4; j++) {
                            Card deleteCard = new Card(j, i);
                            userPack.delete(deleteCard);
                        }
                    }
                }

            }
            else {
                System.out.println("The Computer had a: " + userRequestedCard + "\n");
                int removedCardSuit = 1;
                Card removedCard = new Card(removedCardSuit, userRequestedCard);

                while(computerPack.delete(removedCard) == null) {
                    removedCardSuit++;
                    removedCard = new Card(removedCardSuit, userRequestedCard);
                }

                userPack.insert(removedCard);
                System.out.println("A " + removedCard.toString() + " was inserted into your deck.\n");
                System.out.println("You get to guess again! \n");
                guessedCorrectly = 1;

                for (int i = 1; i < 13; i++) {
                    if(userPack.count(i) == 4) {
                        userBooks++;
                        System.out.println("You have a book of " + i + "'s! Congrats!\n");
                        System.out.println("All of the " + i + "'s have been removed from you hand.\n");
                        for (int j = 1; j <= 4; j++) {
                            Card deleteCard = new Card(j, i);
                            userPack.delete(deleteCard);
                        }
                    }
                }

            }
        } while (guessedCorrectly == 1);

            do {
                if(computerPack.getSize() == 0) {
                    break;
                }
                
                computerRequestedCard = rand.nextInt(0, 13) +1;

                while(computerPack.count(computerRequestedCard) == 0) {
                    computerRequestedCard = rand.nextInt(0, 13) +1;
                }

                System.out.println("The computer asks for a: " + computerRequestedCard + "!\n");

                if(userPack.count(computerRequestedCard) > 0) {
                    System.out.println("Oh no! You have a " + computerRequestedCard + "!\n");
                    int removedCardSuit = 1;
                    Card removedCard = new Card(removedCardSuit, computerRequestedCard);

                    while(userPack.delete(removedCard) == null) {
                        removedCardSuit++;
                        removedCard = new Card(removedCardSuit, computerRequestedCard);
                    }

                    computerPack.insert(removedCard);
                    System.out.println("A " + removedCard.toString() + " was inserted into the computer's deck.\n");
                    System.out.println("The computer gets to guess again. \n");
                    guessedCorrectly = 1;

                    for (int i = 1; i < 13; i++) {
                        if(computerPack.count(i) == 4) {
                            computerBooks++;
                            System.out.println("The computer got a book of " + i + "'s.\n");
                            System.out.println("All of the " + i + "'s have been removed from the computer's hand.\n");
                            for (int j = 1; j <= 4; j++) {
                                Card deleteCard = new Card(j, i);
                                computerPack.delete(deleteCard);
                            }
                        }
                    }

                }
                else {
                    System.out.println("You say: GO FISH!\n");
                    if(stock.getSize() == 0) {
                        System.out.println("No card was drawn because the deck is empty.\n");
                    }
                    else {
                    computerPack.insert(stock.deleteAny());
                    System.out.println("The computer drew a card.\n");
                    }
                    guessedCorrectly = 0;

                    for (int i = 1; i < 13; i++) {
                        if(computerPack.count(i) == 4) {
                            computerBooks++;
                            System.out.println("The computer got a book of " + i + "'s.\n");
                            System.out.println("All of the " + i + "'s have been removed from the computer's hand.\n");
                            for (int j = 1; j <= 4; j++) {
                                Card deleteCard = new Card(j, i);
                                computerPack.delete(deleteCard);
                            }
                        }
                    }
                }

            } while (guessedCorrectly == 1);

        }

        if(userBooks + computerBooks == 26) {
            System.out.println("Every pair in the game was had.\n");
        }
        else if (userPack.getSize() == 0) {
            System.out.println("The game ended because your hand size went to 0!\n");
        }   
        else {
            System.out.println("The game ended because the computer's hand size went to 0!\n");
        }
            if(userBooks > computerBooks) {
                System.out.println("The winner is..... YOU! Congrats!\n");
            }
            else if(userBooks < computerBooks){
                System.out.println("The winner is..... THE COMPUTER! Sorry! Better luck next time!\n");
            }
            else {
                System.out.println("The winner is.... NOBODY! IT'S A DRAW! Congrats?\n");
            }

     }

     else { //QUIT
        break;
     }

     do {
     System.out.println("Would you like to repeat the Card Program? 1 for yes and 0 for no.\n");
     repeat = scan.nextInt();
     } while(repeat != 1 && repeat !=0);

        } while(repeat == 1);

        System.out.println("Thanks for using the Card Program! Goodbye!");
    }
}

class Card {
    private int _suit;
    private int _value;

    Card(int suit, int value){
        _suit = suit;
        _value = value;
    }

    public int getSuit() {
        return _suit;
    }

    public int getValue() {
        return _value;
    }

    public String toString() {
        String finalString = "";

        switch(_value) {
            case 1:
                finalString += "Ace of ";
                break;
            case 2:
                finalString += "2 of ";
                break;
            case 3:
                finalString += "3 of ";
                break;
            case 4:
                finalString += "4 of ";
                break;
            case 5:
                finalString += "5 of ";
                break;
            case 6:
                finalString += "6 of ";
                break;
            case 7: 
                finalString += "7 of ";
                break;
            case 8:
                finalString += "8 of ";
                break;
            case 9: 
                finalString += "9 of ";
                break;
            case 10:
                finalString += "10 of ";
                break;
            case 11: 
                finalString += "Jack of ";
                break;
            case 12:
                finalString += "Queen of ";
                break;
            case 13:
                finalString += "King of ";
                break;
        }

        switch(_suit) {
            case 1: 
                finalString += "Hearts";
                break;
            case 2:
                finalString += "Spades";
                break;
            case 3:
                finalString += "Diamonds";
                break;
            case 4: 
                finalString += "Clubs";
                break;
        }

            return finalString;
        }
    }

    class PackofCards {
        private Card [] pack;
        private static final int ALLOC = 52;
        private int _size;
        private static Random rand = new Random();

        PackofCards() {
            pack = new Card[ALLOC];
            _size = 0;
        }
    
        public void insert(Card newCard) {

            if (_size == pack.length) {
                Card [] temp = new Card [pack.length + ALLOC];
                for (int i = 0; i < _size; i++) {
                    temp[i] = pack[i];
                    pack = temp;
                }
            }

            pack[_size] = newCard;
            _size++;
        }

        public Card delete (Card deleteCard) {
            if (_size == 0) {
                return null;
            }

            for (int i = 0; i < _size; i++) {
                if(deleteCard.getValue() == pack[i].getValue() && deleteCard.getSuit() == pack[i].getSuit()) {
                    for (int j = i; j < _size; j++) {
                        if(j < _size-1) {
                            pack[j] = pack[j+1];
                        }
                        else {
                            pack[j] = null;
                        }
                    }
                _size--;
                return deleteCard;
                }
            }
            return null;
        }

        public Card deleteAny() {

            int resolved = 0;
            Card deleteCard;

            do {
                if(_size == 0) {
                    System.out.println("Cannot delete anything because size is 0.");
                    break;
                }
            int toDeleteSuit = rand.nextInt(4) + 1;
            int toDeleteValue = rand.nextInt(13) +1;

            deleteCard = new Card(toDeleteSuit, toDeleteValue);

            if(delete(deleteCard) != null) {
                resolved = 1;
                return deleteCard;
            }
            } while(resolved == 0);
            return null;
        }

        public int count(int value) {
            int count = 0;
            for (int i = 0; i < _size; i++) {
                if (pack[i].getValue() == value) {
                    count++;
                }
            }
            return count;
        }

        public int getSize() {
            return _size;
        }

        public String toString() {

            if(_size==0) {
                return "There's nothing in this deck.";
            }

            String finalString = "";

            for (int i = 0; i < _size-1; i++) {
                finalString += pack[i].toString() + ",\n";
            }

            finalString += pack[_size-1].toString();

            return finalString;
        }
    }

