
class star{
public static void main (String[] args){
int num = 3;
PrintStar(num);
}
public static void PrintStar(int num){
for(int i = 1; i<=num ; i++){
         for(int j = 1; j<= num ; j++){
             System.out.print("*");
         }
             System.out.println(" ");
      }  
   }
}