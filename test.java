import java.util.Scanner;
class test
{
static int u;
static
{
u=10;
System.out.println("Static block called ");
}
}
class Main
{
public static void main(String[] args)
{
System.out.println(test.u);
}
}