import java.awt.*;
public class MyFrame extends Frame{
	public MyFrame(){
		Frame f = new Frame();
	Button b = new Button("Click Me  !");
		// for position 
		b.setBounds(30,100,80,30);
		f.add(b); // adding frame
		f.setSize(500,600);
	//setTitle("This is example");
	f.setLayout(null);
	f.setVisible(true);
	}
	public static void  main(String args[]){
		MyFrame f = new MyFrame();
	}
}
