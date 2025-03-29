import java.util.Scanner;
public class Guessnum
{
    public  static void main(String[] args)
    {
     System.out.println("this is the progran of guess your number bw 1-100");
      
        Scanner sc =new Scanner(System.in) ;
        
        int randomnum=(int)(Math.random()*100)+1;
        int yournum=0;
        
        do{
            System.out.println("Enter  your number bw 1-100 : ");
             yournum=sc.nextInt();
            if(yournum==randomnum)
            {
                System.out.println("WOOH !---CORRECT ");
                break;

            }
            else if (yournum>randomnum)
            {
                System.out.println("YOUR NUMBER IS TOO LARGE");
                System.out.println("please enter small value---> !");
            }
        
            else 
             {
                System.out.println("YOUR NUMBER IS TOO SMALL");
                System.out.println("please enter large value---> !");

            }

        }while(yournum>0);
       
        System.out.println("the given number is"+ randomnum);
        
    }
}