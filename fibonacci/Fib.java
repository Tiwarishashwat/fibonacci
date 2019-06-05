import java.util.Scanner;
class Fib
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
int num;
int a=0;
int b=1;
int sum=0;
System.out.println("Enter any number to print its fibonacci series");
num=obj.nextInt();
while(sum!=num)
{
   if(num==0)
   {
    System.out.println("Series doesn't exist");
    break;
   }
   else if(num==1)
   {
    System.out.print(1);
    break;
   }
   else
   {
   if(a==1 && b==1)
   {
     System.out.print(1+"\t"); 
    }
    sum=a+b;
     a=b;
     b=sum;
    System.out.print(sum+"\t");
   }
}
}
}
