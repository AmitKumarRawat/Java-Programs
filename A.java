class A extends Thread 
{

public void run()
{
for(int i=0;i<10;i++){
System.out.println("This is currently running thread : ");
}}
static public void main(String args[]){
A obj = new A();
obj.start();
}

}