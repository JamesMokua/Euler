//Euler Problem Number 4

public class Palindrome {
    public static void main(String[] args){
        int max = 1;
        //for loop to find the products of the largest three digit numbers
        for(int i=100; i <= 999; i++){
            for(int j=100; j <= 999; j++){
          int p = i * j; 
          int number = p;
          int reverse = 0;
          //reverses the given number
          while(number != 0)   
          {  
          int remainder = number % 10;  
          reverse = reverse * 10 + remainder;  
          number = number/10;  
          }  
         
         if(reverse == p && p > max){
             //Checks to see if the reverse of the number is the same as the number
             //Checks to see if the number is the max then assigns it to max in order to give it an ascending format
             System.out.println(p);
             max = p;
             System.out.println("Max:" +max);
             
         }
        }
        }
        
    }
    
}
