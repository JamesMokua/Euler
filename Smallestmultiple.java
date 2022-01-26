// Euler problem number 5
public class Smallestmultiple {
    public static void main(String[] args){
        long number = 1;

        for (int i = 1; i <= 20; i++) {
            if (number % i != 0) {
                i = 1; //restart i
                number++;
            }
        } 
       System.out.println(number);
    }
    
}
