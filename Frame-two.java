import java.awt.*;
public class Frametwo extends Frame{
	public Frametwo(){
		Frame f = new Frame("Example two");
		Checkbox c1 = new Checkbox("C-(Programming language)");
		add(c1);
		//add(c2);
		//Checkbox c2 = new Checkbox("Java-(Programming language)",true);
		c1.setBounds(50,100,50,50);
		//c2.setBounds(50,100,50,50);
		f.setSize(300,400);
		f.setVisible(true);
		f.setLayout(null);
	}
	public static void main(String args[]){
	 new Frametwo();
	}
}