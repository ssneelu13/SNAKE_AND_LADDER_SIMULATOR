package SNAKE_AND_LADDER_USECASES;
import java.util.Random;
public class Snake_And_Ladder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game!!!");
        int player1_position=0; //starting position of two player
        int player2_position=0;
        int winning_position=100; //usecase1:Snake and Ladder game played with single player at start position 0
        Random random = new Random(); //random function
        int total_dice_rolls=0; //counter variable
        while(player1_position<winning_position && player2_position<winning_position){
            int dice_roll = random.nextInt(6) + 1; //usecase2:player 1's turn,The Player1/player rolls the die to get a number 1-6
            total_dice_rolls++;
            int option = random.nextInt(3); //usecase3:ladder,snake condition
            switch (option) {
                case 0:
                    int snake_bite = random.nextInt(6) + 1; //Move the player back by a random number between 1-6 if snake bites
                    player1_position = Math.max(0, player1_position - snake_bite);
                    break;
                case 1:
                    player1_position += dice_roll; //Move the player forward by a random number 1-6 if ladder
                    break;
                default:
                    player1_position += dice_roll; //no ladder,no snake-bite then move forward
            }
             if(player1_position < 0){ //usecase4:player position below zero
                player1_position=0;
            }
            else if (player1_position > winning_position) { //usecase5:beyond winning position
                player1_position = winning_position;
            }
            System.out.println("Player1 rolled the dice : " + dice_roll + " and moved to position : " + player1_position);
            /*usecase6: the no. of times the dice was rolled and the position of player1 at every roll*/
            if(player1_position >= winning_position){
                System.out.println("Player1 wins");
                System.out.println("the total number of times the dice was rolled to win the game : "+total_dice_rolls);
                break;
            }
            //usecase7:play the game with two players
        dice_roll = random.nextInt(6) + 1; //usecase2:player 2's turn,The Player1 rolls the die to get a number 1-6
        total_dice_rolls++;
        option = random.nextInt(3); //usecase3:ladder,snake condition
        switch (option) {
            case 0:
                int snake_bite = random.nextInt(6) + 1; //Move the player back by a random number between 1-6 if snake bites
                player2_position = Math.max(0, player2_position - snake_bite);
                break;
            case 1:
                player2_position += dice_roll; //Move the player forward by a random number 1-6 if ladder
                break;
            default:
                player2_position += dice_roll; //no ladder,no snake-bite then move forward
        }
        if(player2_position < 0){ //usecase4:player position below zero
            player2_position=0;
        }
        else if (player2_position > winning_position) { //usecase5:beyond winning position
            player2_position = winning_position;
        }
        System.out.println("Player2 rolled the dice : " + dice_roll + " and moved to position : " + player1_position);
        /*usecase6: the no. of times the dice was rolled and the position of player2 at every roll*/
        if(player2_position >= winning_position){
            System.out.println("Player2 wins");
            System.out.println("the total number of times the dice was rolled to win the game : "+total_dice_rolls);
            break;
        }
    }
        System.out.println("Congratulations! you completed the game!");
        //System.out.println("the total number of times the dice was rolled to win the game : "+total_dice_rolls);
    }

    }
