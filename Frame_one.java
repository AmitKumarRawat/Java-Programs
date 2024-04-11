import java.awt.*;
public class Frame_one extends Frame{
	public Frame_one(){
		Frame f = new Frame("Example two");
		Button b = new Button("click here !");
		f.add(b);
		b.setBounds(100,100,50,50);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
	}
	public static void main(String args[]){
	 new Frame_one();
	}
}