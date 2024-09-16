import java.util.Scanner;

class Task6{
public static void main(String[] args) {
    
    Scanner scan=new Scanner(System.in);
  
    
    boolean exit=false;
double UAN=0;
double USD=0;
double EURO=0;
double CAD=0;

System.out.println("How mach money do you want to top up(UAH)?");
double fisrtmoney=scan.nextDouble();
UAN +=fisrtmoney;
System.out.println(UAN);

    while(exit==false){


 System.out.println("What you want to do?");
 System.out.println("If you want to change from UAH to USD, Press `1`");
 System.out.println("If you want to change from UAH to CAD, Press `2`");
 System.out.println("If you want to change from UAH to EURO, Press `3`");
 System.out.println("If you want to top up, Press `4`");
 System.out.println("If you want to check money, Press `5`");
 System.out.println("If you want to exit, Press `6`");
int whatYouWant=scan.nextInt();

switch (whatYouWant) {
    case 1: if(UAN>0){ USD = UAN /getAmericanToUKraine();UAN=0; System.out.println("You have USD in UAN: "+USD);} 
    else {System.out.println("You don't have money");
   }
   
        
        break;
        case 2: if(UAN>0){ CAD = UAN /getCanadianToUKraine() ;UAN=0; System.out.println("You have CAD in UAN: "+CAD);} 
        else {System.out.println("You don't have money");
       }
       
        
        break;
         case 3: if(UAN>0){ EURO = UAN /getEuroToUKraine() ;UAN=0; System.out.println("You have EURO in UAN: "+EURO);} 
         else {System.out.println("You don't have money");
        }
        
        break;
         case 4: System.out.println("How many do you want to top up?"); fisrtmoney=scan.nextDouble(); UAN +=fisrtmoney; System.out.println("You have: "+ UAN);
        
        break;
        case 5:
        System.out.println("You have: "+ "USD:"+ USD+" EURO:"+EURO+" CAD:"+CAD+" UAH:"+UAN);
        break;
         case 6:
        exit=true;
        break;
    default: System.out.println("You enter something wrong");
        break;
}}

scan.close();}


public static double getAmericanToUKraine(){return 41.33;}

public static  double getEuroToUKraine(){ return 45.50;}
   
public static  double getCanadianToUKraine(){ return 30.22;}}





