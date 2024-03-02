class Amitpa           //  PROGRAM TO FIND PALINDROME NUMBER IN JAVA
{
void palindrome(int i)
{
int c=0,s=0,r=0;
c=i;
while(i!=0)
{               // CERATING LOGIC
s=i%10;    //s=1 ,s=2,s=1
r=(r*10)+s;//r=1,12, 121
i=i/10;// i=12,1
}
if(r==c) System.out.println("Number is Palindrome : "+r);
else System.out.println(" Not "+r);
}
public static void main(String args[])
{
Amitpa pal = new Amitpa();
pal.palindrome(121);
}
}
