import java.util.Scanner;
public class Math{

public static int add (int a , int b ){
return a+b;
}

public static void main (String args []){

Scanner sc1 = new Scanner (System.in);
System.out.println("Please select your choice");
int choice = sc1.nextInt();


if (choice == 1){
System.out.println("Please select your choice");
int a = sc1.nextInt();
System.out.println("Please select your choice");
int b = sc1.nextInt();
System.out.println("answer is : "+ add (a,b));
}


}





}
