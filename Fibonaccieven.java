//Euler Problem Number 2
public class Fibonaccieven {
 public static void main(String[] args) { 
  int n1=0,n2=1,n3=0,sum=0;  
 do{
     if (n2 % 2 == 0) {
        sum += n2;
    }
       n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
}
while(n2 < 4000000);
System.out.print(sum);

}
}
