// making abstract classa
abstract class Abstraction
{
abstract void dis();
}
class Demo extends Abstraction
{
void dis()
{
System.out.pritln("Property of Abstraction :");
}
public static void main(String args[])
{
Demo obj=new Demo();
obj.dis();
}
}