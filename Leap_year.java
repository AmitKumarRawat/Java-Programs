		/* Leap Year program */
class Leap_year 
{
void leap()
{
int y=2023;
if(y%400==0 &&  y%100==0 || y%100!=0 && y%4==0)
{System.out.println(" This is leap year : " +y);}
else 
{System.out.println("This is not leap year : ");}
}
public static void main(String args[])
{
Leap_year leapy = new Leap_year();
leapy.leap();
}
}