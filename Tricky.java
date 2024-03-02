              //  Finding Armstrong number using java code 
class Tricky
{
void armstrong() // defining logic here 
{
int i=158,c=0,s=0,r=0;
//                 153 = (3*3*3)+(5*5*5)+(1*1*1)=153
c=i;
while(i>0)
{
  s=i%10;   // 153 s=5 /*    */
r=r+(s*s*s); // r=27,r=125,r=1 
i=i/10; // i=1 
}
if(r==c) // for output 
{
System.out.println("Number is Armstrong : "+r);
}
else 
{
System.out.println(" Not "+r);
}
}
public static void main(String args[]) 
{
Tricky obj = new Tricky();
obj.armstrong();
}
}


	
  	
