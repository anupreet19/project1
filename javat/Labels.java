import java.awt.*;
class Labelstext
{
	public static void main(String args[])
	{
		Frame f=new Frame("Example");
		TextField t1,t2;
		Label l1,l2;
		t1=new TextField("Text field 1");
		t1.setBounds(50,100,200,30);
		t2=new TextField("Text field 2");
		t2.setBounds(50,100,200,30);
		f.add(t1);
		f.add(t2);
		l1=new Label("First Label");
        l1.setBounds(50,100,100,30);
        l2=new Label("Second Label");
        l2.setBounds(50,150,100,30);
        f.add(l1);
        f.add(l2);
        f.setLayout(null);
        f.setVisible(true);
	}
} 