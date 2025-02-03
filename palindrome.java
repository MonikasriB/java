import java.util.Scanner;
public class palindrome{
public static boolean ispalindrome(int num){
int rever = 0;
int n = num;
while(num!=0){
rever = rever * 10 + num % 10;
num = num/10;
}
if(n == rever)
return true;
else
return false;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int n = sc.nextInt();
if(ispalindrome(n))
System.out.println(n + "is a palindrome");
else
System.out.println(n + "is not a palindrome");
}
}