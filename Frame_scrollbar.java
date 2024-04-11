import java.awt.*;

public class Frame_scrollbar extends Frame
{
	public Frame_scrollbar()
	{
		Frame f = new Frame();
		Button b1 = new Button("East");
		Button b2 = new Button("west");
		Button b3 = new Button("north");
		Button b4 = new Button("south");
		Button b5 = new Button("center");
		// border layout manager 
		f.add(b1,BorderLayout.EAST);
		f.add(b2,BorderLayout.WEST);
		f.add(b3,BorderLayout.NORTH);
		f.add(b4,BorderLayout.SOUTH);
		f.add(b5,BorderLayout.CENTER);
		f.setVisible(true);
		f.setSize(400,400);
		//f.setLayout(null);
	}
	public static void main(String args[])
	{
		new Frame_scrollbar();
	}
}