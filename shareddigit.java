import java.util.Scanner;
public class shareddigit{
public static boolean sharedDigit(int a, int b){
int lefta = a / 10;
int righta = a % 10;
int leftb = b / 10;
int rightb = b % 10;
while(a>=10 && b<=99){
if(lefta == rightb || righta == rightb||lefta == leftb||righta == leftb)
return true;
else
 return false;
}
return false;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a:");
int a = sc.nextInt();
System.out.println("Enter the value of b:");
int b = sc.nextInt();
System.out.println(sharedDigit(a,b));
}
}