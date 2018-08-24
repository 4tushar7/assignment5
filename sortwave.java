import java.util.Scanner;
import java.util.*;
class sortt
{

public static void main(String[] args)
{
sortt obj=new sortt();
int myarr[]={1,2,3,4,5,6,7,8,9,10};
int x=myarr.length;
obj.sortinwave(myarr, x);
for(int i : myarr)
System.out.print(i + " ");
}

void swap(int myarr[],int a,int b)
{
int tmp=myarr[a];
    myarr[a]=myarr[b];
    myarr[b]=tmp;
}

void sortinwave(int myarr[],int x)
{
int i;
  Arrays.sort(myarr);
for(i=0;i<x-1;i+=2)
{
swap(myarr,i,i+1);
}
}
}