import java.util.Scanner;
class highest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number:");
int num1 = sc.nextInt();
System.out.println("Enter the first number:");
int num2 = sc.nextInt();
System.out.println("Enter the first number:");
int num3 = sc.nextInt();
System.out.println("The greatest number is: " + highestnumber(num1, num2, num3));

}
public static int highestnumber(int num1, int num2, int num3){
 return (num1 > num2)?((num1 > num3)? num1 : num3):(num2 > num3 ? num2 : num3);

}
}