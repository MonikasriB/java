import java.util.Scanner;
class letter{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the letter:");
char letterA = sc.next().charAt(0);
char letterB = sc.next().charAt(0);
        System.out.println("'A' < 'B': " + (letterA < letterB));
        System.out.println("'A' <= 'B': " + (letterA <= letterB));
        System.out.println("'A' > 'B': " + (letterA > letterB));
        System.out.println("'A' >= 'B': " + (letterA >= letterB));
        System.out.println("'A' == 'B': " + (letterA == letterB));
        System.out.println("'A' != 'B': " + (letterA != letterB));
}
}

