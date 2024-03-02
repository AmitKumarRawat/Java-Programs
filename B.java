interface Test1     // definng concept of interfave in java
{
 void dis();
}
class A implement Test1   // implenting a class 
{
void dis()
{
System.out.println(" Testing interface property of abstraction : ");
}
public static void main(String args[])
{
A obj = new A();
obj.dis(); // calling  through object of an interface 
}
}
