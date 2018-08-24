import java.util.Scanner;
class Display
{
Display(int r,int s)
{
System.out.println(r+" + "+s+"i");
}
}

class Complex
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int real,imag;
System.out.print(" Enter the real number =");
real=s.nextInt();
System.out.print(" Enter the imaginary number =");
imag=s.nextInt();
Display a1=new Display(real,imag);
}
}

