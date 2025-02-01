import java.util.Scanner;
public class multiplication{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
 tables(n);

}
public static void tables(int n){
int i = 1;
while(i<=10){
int result = n * i;
System.out.println(n + " * " + i + " = " + result);
i++;
}
}
}