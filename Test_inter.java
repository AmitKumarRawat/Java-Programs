interface Akgamer
{
void interfacetest();
}
class Ak implements Akgamer
{
public void interfacetest()
{
System.out.println("My name is Amit Gamer : ");
}
public void sri()
{
System.out.println(" This is imlemented class ");
}
}
class Test_inter extends Ak
{
public static void main(String args[])
{
Ak obj = new Ak();
obj.interfacetest();
obj.sri();
}
}