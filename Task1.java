import java.util.Scanner;

public class Task1{


public static void main(String[] args) {
    
    Scanner num =new Scanner(System.in);
    System.out.println("Enter the number");
   short geting_number= num.nextShort();
while(geting_number>0){
if(geting_number % 2 !=0){
    
    System.out.print("1");
    geting_number = (short) (geting_number / 2); 


}else{
    
    System.out.print("0");
    geting_number = (short) (geting_number / 2);}}}}