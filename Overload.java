class method
{
void starprint()
{
int i,g;
for(i=0;i<=7;i++){
for(g=0;g<=i;g++){
System.out.print(" * ");
}
System.out.print("\n");
}
}
}
public class Overload
{
float k=0.0f;
float pi=3.14f;
void area(int x,int y)
{
k=x*y;
System.out.println("Area of rectangle is : "+k);
}
void area(int r)
{
k=0;
k=pi*r*r;
System.out.println("Area of circle : "+k);
}
public static void main(String args[])
{
Overload over = new Overload();
over.area(7,6);
over.area(4);
over.starprint();
}
}

