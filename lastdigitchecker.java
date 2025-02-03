import java.util.Scanner;
public class lastdigitchecker{
public static boolean lastdigit(int a, int b, int c){
int righta = a % 10;
int rightb = b % 10;
int rightc= c % 10;
while((a>=10 && a<=1000) && (b>=10 && b<=1000) && (c>=10 && c<=1000)){
if(righta == rightb || rightb == rightc|| rightc == righta)
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
System.out.println("Enter the value of c:");
int c = sc.nextInt();
System.out.println(lastdigit(a,b,c));
}
}