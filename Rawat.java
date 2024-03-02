class Rawat
{
 int i=5,g=19,c=0,fact=1;

void sum()
{
 c=i+g;
System.out.println("Sum of two integers : "+c);
}
void factorial()
{
 for(i=1;i<=5;i++)
{
fact=fact*i;
}
System.out.println("Factorial of the integer is : "+fact);
}
// print star pattern in java 
void starpattern()
{
int a=0,b=0;
for(a=0;a<=5;a++)
{
for(b=0;b<=a;b++)
{
System.out.print(" * ");
}

System.out.print("\n");
}
}
// print palindrome number in java 
void palindrome()
{
int m=121,s=0,p=0,ci=0;
p=m;
while(m!=0)
{
s=m%10;
ci=ci*10+s;
m=m/10;
}
if(p==ci)
{
 System.out.println("Number is palindrome : "+p);
}
else 
{
 System.out.println("	not	"+p);
}
}



public static void main(String args[])
{
  Rawat add = new Rawat();
add.sum();
add.factorial();
add.starpattern();
add.palindrome();
}
 }
