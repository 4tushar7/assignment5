import java.util.Scanner;
class sec
{
public static void main(String[] args)
{
int myarr[]={1,9,5,33,67,24,6,89,12,54};
int large=myarr[0];
int seclarge=myarr[0];
System.out.println("Array :");
for(int x=0;x<myarr.length;x++)
{
System.out.print(myarr[x]+" ");
}
System.out.println();
for(int x=0;x<myarr.length;x++)
{
 if(myarr[x]>large)
   {
    seclarge=large;
    large=myarr[x];
   }
 else if(myarr[x]>seclarge)
   {
    seclarge = myarr[x];
   }
}
System.out.println("Second largest number is = "+seclarge);
}
}