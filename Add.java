import java.util.Scanner;
class Add{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
int num1 = sc.nextInt();
System.out.println("Enter the second number:");
int num2 = sc.nextInt();
System.out.println("Enter the third number:");
int num3 = sc.nextInt();
SumofThree(num1, num2, num3);

 }
public static void SumofThree(int num1, int num2, int num3){
int sum = num1 + num2 + num3;
System.out.println("The sum of three number is : " +sum);
}
}