import java.util.Scanner;
public class sumofodd1{
public static int odddigitsum(int num){
int n = num;
int sum = 0;
int remainder;
while(num != 0){
remainder = num % 10;
if(remainder % 2 == 1)
sum = sum + remainder; 
num = num / 10;
}
return sum;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number:");
int num = sc.nextInt();
int sum = odddigitsum(num);
System.out.println("sum of odd digits:" + sum);
}
}