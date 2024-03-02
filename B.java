interface Test1
{
 void dis();
}
class A implement Test1
{
void dis()
{
System.out.println(" Testing interface property of abstraction : ");
}
public static void main(String args[])
{
A obj = new A();
obj.dis();
}
}
