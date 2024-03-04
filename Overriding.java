class A
{
static int a=21;
void display()
{
System.out.println("This is a supser class  : ");
}
}
class B extends A
{
void display()
{
System.out.println("This is a sub  class  :Ak_47 ");
}
public static void main(String args[])
{
 B obj =  new B();
System.out.println("Value  of member : "+a);
obj.display();
obj.display();
}
}
