package W1.lab2sol;

import javax.swing.*;

public class RollTheDice {
    public static void main(String[] args) {
        String answer;
        char result;
        int computerWins=0,playerWins=0,draws=0,numberOfGames=0;

        answer = JOptionPane.showInputDialog(null,"Would you like to play a game of roll the dice? (yes or no)");

        while(answer.equals("yes"))
        {
            result = rollTheDice();

            numberOfGames++;

            if(result == 'c')
                computerWins++;
            else if(result=='p')
                playerWins++;
            else
                draws++;

            JOptionPane.showMessageDialog(null,"Games played: " + numberOfGames + "\nComputer Wins: " + computerWins +
                    "\nPlayer wins: " + playerWins + "\nDraws: " + draws ,"Game Info",JOptionPane.INFORMATION_MESSAGE);

            answer = JOptionPane.showInputDialog("Would you like to play another game? (yes or no)");
        }
    JOptionPane.showMessageDialog(null,"Thanks for playing the game!","Farewell",JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);

    }

    private static char rollTheDice()
    {
     int computerRoll,playerRoll;

     computerRoll = (int)(Math.random()*11)+2;
     JOptionPane.showMessageDialog(null,"The computer roll generated the value " + computerRoll + "\n .... now hit return to see the player roll",
             "Computer Roll",JOptionPane.INFORMATION_MESSAGE);
     playerRoll = (int)(Math.random()*11)+2;
     JOptionPane.showMessageDialog(null,"The player roll generated the value " + playerRoll ,
             "Player Roll",JOptionPane.INFORMATION_MESSAGE);

     if(computerRoll>playerRoll)
         return 'c';
     else if(playerRoll>computerRoll)
         return 'p';
     else
         return 'd';


    }
}
