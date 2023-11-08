package SNAKE_AND_LADDER_USECASES;
import java.util.Random;
public class Snake_And_Ladder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        int player_position=0; //starting position of player
        int winning_position=100; //usecase1:Snake and Ladder game played with single player at start position 0
        Random random = new Random();
        while(player_position<winning_position){
            int diceRoll = random.nextInt(6) + 1; //usecase2:The Player rolls the die to get a number 1-6
            
        }

        }

    }
