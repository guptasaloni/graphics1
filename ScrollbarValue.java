import java.awt.*;
import java.awt.event.*;

class ScrollbarValue implements AdjustmentListener
{
	Frame f; Scrollbar sb;
	Panel p; Label l;
	TextField t;
	public ScrollbarValue()
	{
		f=new Frame();
		f.setSize(400,400);
		
		sb=new Scrollbar(Scrollbar.VERTICAL,0,5,0,300);
		sb.addAdjustmentListener(this);
		
		p=new Panel();
		l=new Label("Value:");
		t=new TextField(5);
		
		p.add(l); p.add(t);
		f.add(p,"South");
		f.add(sb,"East");
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int v=sb.getValue();
		t.setText(v+"");
	}
	public static void main(String args[])
	{
		new ScrollbarValue();
	}
}