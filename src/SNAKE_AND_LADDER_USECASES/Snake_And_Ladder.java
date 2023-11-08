package SNAKE_AND_LADDER_USECASES;
import java.util.Random;
public class Snake_And_Ladder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        int player_position=0; //starting position of player
        int winning_position=100; //usecase1:Snake and Ladder game played with single player at start position 0
        Random random = new Random();
        while(player_position<winning_position){
            int dice_roll = random.nextInt(6) + 1; //usecase2:The Player rolls the die to get a number 1-6
            int option = random.nextInt(3); //usecase3:ladder,snake condition
            switch (option) {
                case 0:
                    int snake_bite = random.nextInt(6) + 1; //Move the player back by a random number between 1-6 if snake bites
                    player_position = Math.max(0, player_position - snake_bite);
                    break;
                case 1:
                    player_position += dice_roll; //Move the player forward by a random number 1-6 if ladder
                    break;
                default:
                    player_position += dice_roll; //no ladder,no snake-bite then move forward
            }
        }

        }

    }
