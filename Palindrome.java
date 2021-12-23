//Euler Problem Number 4
public class Palindrome {
    public static void main(String[] args){
        int n =999;
        for (int i=100;i < n;i++){
            int k = i+1;
            int product = i * k;
            System.out.println(i+" * "+k+"  = "+product);
        }
    }
}
