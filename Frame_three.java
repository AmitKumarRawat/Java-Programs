import java.awt.*;

public class Frame_three extends Frame
{
	public Frame_three()
	{
		Frame f = new Frame();
		Choice li = new Choice();
		li.setBounds(100,100,75,75);
		li.add("Java");
		li.add("Python");
		li.add("cobol");
		li.add("c#");
		f.add(li);
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(400,400);
	}
	public static void main(String args[]){
		new Frame_three();
	}
}