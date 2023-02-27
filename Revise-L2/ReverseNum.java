import java.util.*;
class ReverseNum{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n!=0){
int rev=0,remain;
remain=n%10;
rev=rev*10+remain;
n/=10;
System.out.print(rev);
}
}
}