import java.util.*;
class Calcu
{
public static void main(String[] args)
{
int a,b,c;
String choice;
Scanner s1=new Scanner(System.in);
System.out.println("Enter two numbers:");
a=s1.nextInt();
b=s1.nextInt();
System.out.println("Enter your choice:");
choice=s1.nextLine();
System.out.println("\n + Addition \n - Subtraction \n * Multiplication \n / Division");
choice=s1.nextLine();
switch(choice)
{
case "+" :c=a+b;
System.out.println("Sum is:"+c);
break;
case "-" :c=a-b;
System.out.println("Difference is:"+c);
break;
case "*" :c=a*b;
System.out.println("Product is:"+c);
break;
case "/" :c=a/b;
System.out.println("Reminder is:"+c);
break;
default :System.out.println("Invalid input");
break;
}
}
}
