
/*
 * 
 * N0probllama
 * 
 * Casino Craps game
 * September 27th - September 2nd, 2022.
 * 
 * This program simulates a simple game of Craps.
 * Please gamble responsibly. 
 */

public class Lab3Craps {
    public static void main(String []args) {

        // Variables for two dice.
        int dice1; 
        int dice2;

        // Generate random number between 1 and 6 with the following.
        // Note to self: starts at 5, counting 0, so the +1 adds one more numerical count value to make 6.
        dice1 = (int)(Math.random()*6)+1; 
        dice2 = (int)(Math.random()*6)+1; 

        //New variable for the sum of dice values.
        int diceSum = (dice1 + dice2);
        System.out.println(diceSum);

        //Check if player wins or loses on the first roll.
        //If player rolls 7 OR 11, instant win. If player rolls 2 OR 3 OR 12, instant death.
        //Any other number rolled is 'point' (diceSum).
        if (diceSum == 7 || diceSum == 11) {
            System.out.println(diceSum + " You win!");
            return;
        }
        if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
            System.out.println(diceSum + " You lose!");
            return;
        }

        /*
         * If the first roll is not a win or lose, the game keeps rolling dice using a while loop.
         * The following dice sums are possible in this stage of the game 2,3,4,5,6,8,9,10,11,12.
         * Rolling point (diceSum) in the rest of the game play (newSum) means the player wins. Rolling 7 means player loses.
         */
        int newSum = 0;

        //while the point (diceSum) is NOT rolled in game play (newSum), and a roll is NOT 7, keep rolling dice (looping).
        while (newSum != diceSum && newSum != 7)  {
            dice1 = (int)(Math.random()*6)+1; 
            dice2 = (int)(Math.random()*6)+1;
            newSum = (dice1 + dice2);
            System.out.println(newSum);
        }

        //IF the dice (newSum) are rolled, and you get point (diceSum), you win!
        //ELSE if you roll 7, you loose!
            if  (newSum == diceSum) {
                System.out.println("You Win!");
                

            } else {
                System.out.println("You Lose!"); 

                newSum = 0;
            }
        } 
    }


