import java.util.*;
class Guesser{
    int guessNum;
   int guessingNumber(){
        System.out.println("Guesser ! Kindly Guess the Number ");
        Scanner sc=new Scanner(System.in);
        guessNum =sc.nextInt();
        return guessNum;


    }
}
class Player{
    int guessNum;
    int guessingNumberByPlayer1(){
        System.out.println("******************************************");
         System.out.println("Player 1 ! Kindly Guess the Number ");
         Scanner sc=new Scanner(System.in);
         guessNum =sc.nextInt();
         return guessNum;
 
 
     }
     int guessingNumberByPlayer2(){
        System.out.println("******************************************");
         System.out.println("Player 2 ! Kindly Guess the Number ");
         Scanner sc=new Scanner(System.in);
         guessNum =sc.nextInt();
         return guessNum;
 
 
     }
     int guessingNumberByPlayer3(){
        System.out.println("******************************************");
         System.out.println("Player 3 ! Kindly Guess the Number ");
         Scanner sc=new Scanner(System.in);
         guessNum =sc.nextInt();
         return guessNum;
 
 
     }

}
class Umpire{
    int guesserNum;
    int player1Num;
    int player2Num;
    int player3Num;

     void collectNumFromGuesser(){
        Guesser guesserObj = new Guesser();
        guesserNum = guesserObj.guessingNumber();
        
 
 
     }
    void collectNumFromPlayers(){
        Player player1Obj = new Player();
        Player player2Obj = new Player();
        Player player3Obj = new Player();
        player1Num = player1Obj.guessingNumberByPlayer1();
        player2Num = player2Obj.guessingNumberByPlayer2();
        player3Num = player3Obj.guessingNumberByPlayer3();
     }
    void compare(){
        if(guesserNum==player1Num){
            if(guesserNum==player2Num && guesserNum==player3Num){
                System.out.println("******************************************");
                System.out.println("******************************************");
                System.out.println("+++++ RESULT +++++");
                System.out.println("all the Player won the Game");
                System.out.println("******************************************");
                System.out.println("******************************************");
            }
            else if(guesserNum==player2Num){
                System.out.println("******************************************");
                System.out.println("******************************************");
                System.out.println("+++++ RESULT +++++");
                System.out.println("Player 1 and Player 2 won the game");
                System.out.println("******************************************");
                System.out.println("******************************************");
            }
            else if(guesserNum==player3Num){
                System.out.println("******************************************");
                System.out.println("******************************************");
                System.out.println("+++++ RESULT +++++");
                System.out.println("Player 1 and Player 3 won the Game");
                System.out.println("******************************************");
                System.out.println("******************************************");
            }
            else{
                System.out.println("******************************************");
                System.out.println("******************************************");
                System.out.println("+++++ RESULT +++++");
                System.out.println("Player 1 won the game");
                System.out.println("******************************************");
                System.out.println("******************************************");
            }
            
        }
        else if(guesserNum==player2Num){
            if(guesserNum==player3Num )
            {
                System.out.println("******************************************");
                System.out.println("******************************************");
                System.out.println("+++++ RESULT +++++");
                System.out.println("Player 2 and Player 3 won the game");
                System.out.println("******************************************");
                System.out.println("******************************************");
            }
            else{
                System.out.println("******************************************");
                System.out.println("******************************************");
                System.out.println("+++++ RESULT +++++");
                System.out.println("Player 2 won the game");
                System.out.println("******************************************");
                System.out.println("******************************************");
            }
            
        }
        else if(guesserNum==player3Num){
            System.out.println("******************************************");
            System.out.println("******************************************");
                System.out.println("+++++ RESULT +++++");
            System.out.println("Player 3 won the game");
            System.out.println("******************************************");
            System.out.println("******************************************");
        }
        else{
            System.out.println("******************************************");
            System.out.println("******************************************");
                System.out.println("+++++ RESULT +++++");
            System.out.println("No one guess the right Number");
            System.out.println("******************************************");
            System.out.println("******************************************");
        }


     }
     
}




class LaunchGame{
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("Game Start");
        System.out.println("******************************************");
        Umpire umpireObj = new Umpire();
        umpireObj.collectNumFromGuesser();
        umpireObj.collectNumFromPlayers();
        umpireObj.compare();
    }
}