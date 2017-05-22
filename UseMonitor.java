import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Monitorex extends JPanel implements ActionListener
{
	static ProgressMonitor pb;
	static int c=0;
	public Monitorex()
	{
		pb=new ProgressMonitor(this,"monitoring progress","initializing---",0,100);
		Timer t=new Timer(500,this);
		t.start();
	}
	public void actionPerformed(ActionEvent e)
	{
		SwingUtilities.invokeLater(new Update());
	}
	class Update implements Runnable
	{
		public void run()
		{
			if(pb.isCanceled())
			{
				pb.close();
				System.exit(0);
			}
			pb.setProgress(c);
			pb.setNote("operation is "+c+"% completed");
			c+=2;
		}
	}
}
	class UseMonitor
	{
		public static void main(String args[])
		{
			JFrame f=new JFrame();
			f.setSize(400,400);
			f.getContentPane().add(new Monitorex());
			f.setVisible(true);
		}
	}