
import java.util.Scanner;

public class Task2{
public static void main(String[] args) {
    
Scanner scann=new Scanner(System.in);
System.out.println("Enter expression");

String input= scann.nextLine().replace("=", "").replace("?", "");

String[] parts = input.split("[+-/*%]");
if (parts.length<2){
    System.out.println("You enter something wrong");
    return;
}

int num1 = Integer.parseInt(parts[0].trim());// trim це фігня яка видаляє пробіли 
int num2 = Integer.parseInt(parts[1].trim()); // parse а ця фігня перобляє з string на int )
char operators = input.charAt(parts[0].length());

switch(operators){

case '+': System.out.println("Result:"+ num1 + "+" + num2 +  "=" +(num1+num2));       break;
case '-': System.out.println("Result:"+ num1 + "-" + num2 +  "=" +(num1-num2));       break;
case '/': System.out.println("Result:"+ num1 + "/" + num2 +  "=" +(num1/num2));       break;
case '*': System.out.println("Result:"+ num1 + "*" + num2 +  "=" +(num1*num2));       break;
case '%': System.out.println("Result:"+ num1 + "%" + num2 +  "=" +(num1%num2));       break;
default: System.out.println("Operators not found");}}}