import java.util.*;
class Main {
   
    public static void main(String[] args) {
       int ranum=(int) (Math.random()*100+1);
       // ranum stores the random number 
        System.out.println("I have generated a number , can you guess the number right? Y/N");
        // Y or N input by user
         Scanner sc=new Scanner(System.in);
          String ans=sc.next();
          int check=1;
             
        while(true)
        {   
           
            if (ans.equals("Y") || ans.equals("N"))
            {
                if (ans.equals("Y"))
                 {
                     
                     System.out.println("Guess any number b/w 1-100");
                
                    while(true)
                {
                        int guessnum=sc.nextInt();
                     if(guessnum>ranum)
                        {
                        System.out.println("wrong , the ans is smaller than this");
                        continue;
                        }
                    if(guessnum<ranum)
                        {
                        System.out.println("wrong , the ans is bigger than this");
                        continue;
                        }
                        if(guessnum==ranum)
                        {
                        System.out.println("CORRECT!");
                        check=1+1;
                        break;
                        }
                 }
                
                }
                if (ans.equals("N"))
                 {
                System.out.println("okay program exits");
                break;
                 }
                 if(check==2)
                 {
                      System.out.println("Do you wanna play again? Y/N");
                      String ans2=sc.next();
                        if (ans2.equals("N"))
                            {
                            System.out.println("okay program exits");
                            break;
                                
                            }
                     if(ans2.equals("Y"))
                     {
                         continue;
                     }
                 }
                  
            }
             
            else
            {
                System.out.println("Not understandable , please try again");   
                continue;
            }
            
        }
        
       
      
    }
}
