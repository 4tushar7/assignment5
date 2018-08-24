import java.util.Scanner;
class rectangle
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
double a,b,c;
System.out.println("Enter the sides of rectangle");
a=s.nextDouble();
b=s.nextDouble();
c=a*b;
CalculateArea a1= new CalculateArea(c);
}
}

class CalculateArea
{
CalculateArea(double r)
{
System.out.println(r);
}
}