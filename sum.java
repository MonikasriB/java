import java.util.Scanner;
class sum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first Number:");
int num1 = sc.nextInt();
System.out.println("Enter the second Number:");
int num2 = sc.nextInt();
SumofTwo(num1, num2);
}
public static void SumofTwo(int num1, int num2){
int num3 = num1 + num2;
System.out.println("The sum of two number is : " + num3);
}
}