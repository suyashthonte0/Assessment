import java.util.*;

public class Main{


     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n,x,c;
        
        Cab cb = new Cab();
    
        System.out.println("Enter the no. Of Test Cases : \n");
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
        System.out.println("Enter the Type Of Cab : \n 1. Mini \n 2. Prime \n 3. Sedan \n");
        n = sc.nextInt();
        
        switch(n)
        {
            case 1 : cb.Mini();
                     break;
            case 2 : cb.Prime();
                     break;
            case 3 : cb.Sedan();
                     break;
            default : System.out.println("Enter Correct Choice !! \n");
                     break;
            
        }
        
        }
        
     }
}

class Cab {
    
    Scanner sc = new Scanner(System.in);
        public void Mini(){
            int x;
            int c=0;
            System.out.println("Enter the Distance Travelled :\n");
              x = sc.nextInt();
            
            if(x<=3)
            {
               c=50;
            }
            else if(x>3&&x<75)
            {
                x=x-3;
                c=(x*10)+50;
            }
            else if(x>=75)
            {
                c=x*8;
            }
            System.out.println("Cost is : "+c);
        
        }
        
        public void Prime()
        {
            int x;
            int c=0;
            System.out.println("Enter the Distance Travelled :\n");
            x = sc.nextInt();
            
            if(x<=5)
            {
                c=80;
            }
            else if(x>5&&x<100)
            {
                x=x-5;
                c=(x*12)+80;
            }
            else if(x>=100)
            {
                c=x*10;
            }
            System.out.println("Cost is : "+c);
        
           // return 0;
        }
        
        public void Sedan()
        {
            
            int x;
            int c=0;
            System.out.println("Enter the Distance Travelled :\n");
            x = sc.nextInt();
            
            if(x<=5)
            {
                c=100;
            }
            else
            {
                x=x-5;
                c=(x*15)+100;
            }
            System.out.println("Cost is : "+c);
        
        //    return 0;
        }
        

}