public class Task3{

public static void main(String[] args) {
    

for (int i = 0; i <= 100; i++) {
    
if(i % 5 ==0 && i%3==0){
 String naw= "FizzBuzz" ;
 i++;
System.out.println(naw);

}
if(i % 5 ==0){
    String buzz= "Buzz" ;
 i++;
System.out.println(buzz);
}if (i%3==0) {
    String fizz= "Fizz" ;
    i++;
   System.out.println(fizz);
}
System.out.println(i);}}}