class Arm
{
void armstrong()
{
int i=153,c=0,r=0,s=0;
s=i;
while(i>0)
{
c=i%10; // c=3,c=5,c=1
r=r+(c*c*c); // r=27,r=125,
i=i/10; // i=15,i=1
}
if(r==s){
System.out.println("Number is armstrong "+s);
}
else {
System.out.println("not "+r);
}
}

public static void main(String args[])
{
Arm obj=new Arm();
// method clling
obj.armstrong();
}
}