import java.util.*;

public class RPS{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");//clears screen 
        String options[] = {"R", "P", "S"};
        int computerScore = 0;
        int playerScore = 0;
        Random rand = new Random();
        boolean running = true;
        while(running){
            System.out.println("Type:R-rock, P-Paper, S-scissors, Q-quit, Sc - score:");
            String ans = sc.next().toUpperCase();
            int number = rand.nextInt(3);
            String computerChoice = options[number];
            String playerOut="";
            String computerOut="";
            if(ans.equals("Q")){
                playerOut = "Quit";
            }
            else if(ans.equals("R")){
                playerOut = "Rock";
            }
            else if(ans.equals("S")){
                playerOut = "Scissors";
            }
            else if(ans.equals("P")){
                playerOut = "Paper";
            }
            
            
            
            if(computerChoice.equals("P")){
                computerOut = "Paper";
            }
            else if(computerChoice.equals("R")){
                computerOut = "Rock";
            }
            else if(computerChoice.equals("S")){
                computerOut = "Scissors";
            }
           
                
            if (ans.equals("Q")){
                System.out.println("Player score:" + playerScore);
                System.out.println("Computer score:" + computerScore);
                System.out.println("Quitting game");
                System.exit(0);
                
            }
            
            else if(ans.equals("SC")){
                System.out.println("Player score:" + playerScore);
                System.out.println("Computer score:"+ computerScore);
            }
            
            else if(ans.equals(computerChoice)){
                System.out.println("Player chose: " + playerOut);
                System.out.println("Computer chose:" + computerOut);
                System.out.println("Tie!");
            }
            
            else if(ans.equals("R")){
                System.out.println("Player chose: " + playerOut);
                System.out.println("Computer chose:" + computerOut);
                if(computerChoice.equals("P")){
                    System.out.println("The computer won!");
                    computerScore +=1;
                }
                else if(computerChoice.equals("S")){
                    System.out.println("The player won!");
                    playerScore +=1;
                }
            }
            else if(ans.equals("S")){
                System.out.println("Player chose: " + playerOut);
                System.out.println("Computer chose:" + computerOut);
                if(computerChoice.equals("R")){
                    System.out.println("The computer won!");
                    computerScore +=1;
                }
                else if(computerChoice.equals("P")){
                    System.out.println("The player won!");
                    playerScore +=1;
                }
                
            }
            else if(ans.equals("P")){
                System.out.println("Player chose: " + playerOut);
                System.out.println("Computer chose:" + computerOut);
                if(computerChoice.equals("S")){
                    System.out.println("The computer won!");
                    computerScore +=1;
                }
                else if(computerChoice.equals("R")){
                    System.out.println("The player won!");
                    playerScore +=1;
                }
                
            }
            
            else{
                System.out.println("Invalid Input");
                System.out.println();
                continue;
            }
            System.out.println();
        }
        
    }
}