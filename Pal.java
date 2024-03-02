class Pal
{
void palindrome(int i)
{
int g=0,c=0,r=0;
c=i;
while(i!=0)
{
g=i%10;// g=2 ,g=5, 2
r=(r*10)+g;// r=252 
i=i/10;// i=0
}
if(r==c) System.out.println("Number is Palindrome : "+r);
else System.out.println("Number is Not Palindrome : "+r);
}
public static void main(String args[])
{
Pal obj = new Pal();
obj.palindrome(252);
}

}